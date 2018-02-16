package com.服务计算实验二服务调用客户端;

import com.EnglishChinese.*;
import com.Weather.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.*;

import com.服务计算实验二本地Web服务端.ComputeService;
import com.服务计算实验二本地Web服务端.ComputeServiceProxy;

public class ComputeInterface extends JFrame implements ActionListener,KeyListener{
	private JPanel jp_1 = new JPanel();//标签 number_1
	private JPanel jp_2 = new JPanel();//标签 number_2
	private JPanel jp_3 = new JPanel();//标签 result
	private JPanel jp_4 = new JPanel();//标签3面板
	private JPanel jp_5 = new JPanel();//标签1面板
	private JPanel jp_6 = new JPanel();//标签2面板
	//private JPanel jp_7 = new JPanel();//标签 城市名称
	private JPanel jp_8 = new JPanel();
	private JPanel jp_9 = new JPanel();
	private JTabbedPane jtp = new JTabbedPane();
	
	private JTextField jtf_1 = new JTextField(10);//数1 number_1
	private JTextField jtf_2 = new JTextField(10);//数2 number_2
	private JTextField jtf_3 = new JTextField(10);//结果result
	private JTextField jtf_4 = new JTextField(10);//文本框 城市名称
	private JTextArea jta = new JTextArea();//文本区域 显示城市天气情况
	private JScrollPane jsp = new JScrollPane(jta);//带滚动条的
	
	private JTextField jtf_5 = new JTextField(10);//要翻译的文本
	private JTextArea jta_2 = new JTextArea();//文本区域 显示翻译后的文本
	private JScrollPane jsp_2 = new JScrollPane(jta_2);//带滚动条的
	private JLabel jl_1 = new JLabel("number_1:");
	private JLabel jl_2 = new JLabel("number_2:");
	private JLabel jl_3 = new JLabel("result:");
	private JLabel jl_4 = new JLabel("请输入城市名称：");
	
	private JButton jb_1 = new JButton("求和");
	private JButton jb_2 = new JButton("求差");
	private JButton jb_3 = new JButton("求积");
	private JButton jb_4 = new JButton("求商");
	private JButton jb[] = new JButton[]{jb_1,jb_2,jb_3,jb_4};
	private JButton jb_5 = new JButton("translate");
	public ComputeInterface(){
		
		jp_4.setLayout(new BorderLayout());
		jp_5.setLayout(new BorderLayout());
		jp_6.setLayout(new BorderLayout());
		//面板1
		jp_1.add(jl_1);
		jp_1.add(jtf_1);
		jp_1.add(jl_2);
		jp_1.add(jtf_2);
		jp_4.add(jp_1,BorderLayout.NORTH);
		//面板2
		for(int i=0;i<4;i++){
			jp_2.add(jb[i]);
		}
		jp_4.add(jp_2, BorderLayout.CENTER);
		//面板3
		jp_3.add(jl_3);
		jp_3.add(jtf_3);
		jp_4.add(jp_3, BorderLayout.SOUTH);
		//添加事件监听器
		for(int i=0;i<4;i++){
			jb[i].addActionListener(this);
		}
		
		jp_8.add(jl_4);
		jp_8.add(jtf_4);
		jp_5.add(jp_8,BorderLayout.NORTH);
		jp_5.add(jsp, BorderLayout.CENTER);
		//添加键盘事件监听器
		jtf_4.addKeyListener(this);
		
		jp_9.add(jtf_5);
		jp_9.add(jb_5);
		jp_6.add(jp_9,BorderLayout.NORTH);
		jp_6.add(jsp_2, BorderLayout.CENTER);
		//添加事件监听器
		jb_5.addActionListener(this);
		
		jtp.add("简易计算器", jp_4);
		jtp.add("天气服务", jp_5);
		jtp.add("英汉互译", jp_6);
		
		this.add(jtp);
		this.setTitle("服务计算实验二");
		this.setBounds(200,200,400,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ComputeInterface();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		ComputeService compute = new ComputeServiceProxy();
		if(e.getSource() == jb_1){
			float num_1 = 0;
			float num_2 = 0;
			if(jtf_1.getText() == null || jtf_1.getText() == " "){
				num_1 = 0;
			}else{
				num_1 = Float.parseFloat(jtf_1.getText());
			}
			if(jtf_2.getText() == null || jtf_2.getText() == " "){
				num_2 = 0;
			}else{
				num_2 = Float.parseFloat(jtf_2.getText());
			}
			float sum = 0;
			try {
				sum = compute.getSum(num_1,num_2);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			jtf_3.setText(String.valueOf(sum));
		}else if(e.getSource() == jb_2){
			float num_1 = 0;
			float num_2 = 0;
			if(jtf_1.getText() == null || jtf_1.getText() == " "){
				num_1 = 0;
			}else{
				num_1 = Float.parseFloat(jtf_1.getText());
			}
			if(jtf_2.getText() == null || jtf_2.getText() == " "){
				num_2 = 0;
			}else{
				num_2 = Float.parseFloat(jtf_2.getText());
			}
			float difference = 0;
			try {
				difference = compute.getDifference(num_1,num_2);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			jtf_3.setText(String.valueOf(difference));
		}else if(e.getSource() == jb_3){
			float num_1 = 0;
			float num_2 = 0;
			if(jtf_1.getText() == null || jtf_1.getText() == " "){
				num_1 = 0;
			}else{
				num_1 = Float.parseFloat(jtf_1.getText());
			}
			if(jtf_2.getText() == null || jtf_2.getText() == " "){
				num_2 = 0;
			}else{
				num_2 = Float.parseFloat(jtf_2.getText());
			}
			float product = 0;
			try {
				product = compute.getProduct(num_1,num_2);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			jtf_3.setText(String.valueOf(product));
		}else if(e.getSource() == jb_4){
			float num_1 = 0;
			float num_2 = 0;
			if(jtf_1.getText() == null || jtf_1.getText() == " "){
				num_1 = 0;
			}else{
				num_1 = Float.parseFloat(jtf_1.getText());
			}
			if(jtf_2.getText() == null || jtf_2.getText() == " "){
				num_2 = 0;
			}else{
				num_2 = Float.parseFloat(jtf_2.getText());
			}
			float quotient = 0;
			try {
				quotient = compute.getQuotient(num_1,num_2);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			jtf_3.setText(String.valueOf(quotient));
		}else if(e.getSource() == jb_5){//翻译
			EnglishChinese ec = new EnglishChinese();
			EnglishChineseSoap ecSoap = ec.getEnglishChineseSoap();
			com.EnglishChinese.ArrayOfString aos = ecSoap.translatorString(jtf_5.getText());
			ArrayList<String> arrayList = (ArrayList<String>)aos.getString();
			StringBuffer sb = new StringBuffer();
			for(String s : arrayList){
				//System.out.println(s);
				sb.append(s+"\n");
			}
			jta_2.setText(sb.toString());
		}
	}
	
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
//		if(e.getKeyCode() == KeyEvent.VK_ENTER){
//			WeatherWebService wws = new WeatherWebService();
//			WeatherWebServiceSoap wwssoap = wws.getWeatherWebServiceSoap();
//			com.Weather.ArrayOfString aos = wwssoap.getWeatherbyCityName(jtf_4.getText());
//			ArrayList<String> arrayList=(ArrayList<String>) aos.getString();
//			StringBuffer sb = new StringBuffer();
//			for(String str:arrayList){
//				sb.append(str);
//			}
//			System.out.println(sb.toString());
//			jta.setText(sb.toString());
//		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			WeatherWebService wws = new WeatherWebService();
			WeatherWebServiceSoap wwssoap = wws.getWeatherWebServiceSoap();
			com.Weather.ArrayOfString aos = wwssoap.getWeatherbyCityName(jtf_4.getText());
			ArrayList<String> arrayList=(ArrayList<String>) aos.getString();
			StringBuffer sb = new StringBuffer();
			for(String str:arrayList){
				sb.append(str+"\n");
			}
			//System.out.println(sb.toString());
			jta.setText(sb.toString());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
