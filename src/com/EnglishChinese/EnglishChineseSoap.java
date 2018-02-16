
package com.EnglishChinese;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EnglishChineseSoap", targetNamespace = "http://WebXml.com.cn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EnglishChineseSoap {


    /**
     * <br /><h3>��ú�ѡ��</h3><p>���������wordKey = ���ʣ� �������ݣ�һά�ַ������� String[]��</p><br />
     * 
     * @param wordKey
     * @return
     *     returns cn.com.webxml.ArrayOfString
     */
    @WebMethod(operationName = "SuggestWord", action = "http://WebXml.com.cn/SuggestWord")
    @WebResult(name = "SuggestWordResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "SuggestWord", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.SuggestWord")
    @ResponseWrapper(localName = "SuggestWordResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.SuggestWordResponse")
    public ArrayOfString suggestWord(
        @WebParam(name = "wordKey", targetNamespace = "http://WebXml.com.cn/")
        String wordKey);

    /**
     * <br /><h3>��Ӣ��˫���� DataSet</h3><p>���������wordKey = ���ʣ� �������ݣ�DataSet��������ȫ����������DataTable��</p><br />
     * 
     * @param wordKey
     * @return
     *     returns cn.com.webxml.TranslatorResponse.TranslatorResult
     */
    @WebMethod(operationName = "Translator", action = "http://WebXml.com.cn/Translator")
    @WebResult(name = "TranslatorResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "Translator", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.Translator")
    @ResponseWrapper(localName = "TranslatorResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.TranslatorResponse")
    public com.EnglishChinese.TranslatorResponse.TranslatorResult translator(
        @WebParam(name = "wordKey", targetNamespace = "http://WebXml.com.cn/")
        String wordKey);

    /**
     * <br /><h3>��Ӣ��˫���루������String()</h3><p>���������wordKey = ���ʣ� �������ݣ�һά�ַ������� String[]��</p><br />
     * 
     * @param wordKey
     * @return
     *     returns cn.com.webxml.ArrayOfString
     */
    @WebMethod(operationName = "TranslatorString", action = "http://WebXml.com.cn/TranslatorString")
    @WebResult(name = "TranslatorStringResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "TranslatorString", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.TranslatorString")
    @ResponseWrapper(localName = "TranslatorStringResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.TranslatorStringResponse")
    public ArrayOfString translatorString(
        @WebParam(name = "wordKey", targetNamespace = "http://WebXml.com.cn/")
        String wordKey);

    /**
     * <br /><h3>��Ӣ��˫���루��ش�����String()</h3><p>���������wordKey = ���ʣ� �������ݣ�һά�ַ������� String[]��</p><br />
     * 
     * @param wordKey
     * @return
     *     returns cn.com.webxml.ArrayOfString
     */
    @WebMethod(operationName = "TranslatorReferString", action = "http://WebXml.com.cn/TranslatorReferString")
    @WebResult(name = "TranslatorReferStringResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "TranslatorReferString", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.TranslatorReferString")
    @ResponseWrapper(localName = "TranslatorReferStringResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.TranslatorReferStringResponse")
    public ArrayOfString translatorReferString(
        @WebParam(name = "wordKey", targetNamespace = "http://WebXml.com.cn/")
        String wordKey);

    /**
     * <br /><h3>��Ӣ��˫���루���䣩String()</h3><p>���������wordKey = ���ʣ� �������ݣ�һά�ַ������� String[]��</p><br />
     * 
     * @param wordKey
     * @return
     *     returns cn.com.webxml.ArrayOfString
     */
    @WebMethod(operationName = "TranslatorSentenceString", action = "http://WebXml.com.cn/TranslatorSentenceString")
    @WebResult(name = "TranslatorSentenceStringResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "TranslatorSentenceString", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.TranslatorSentenceString")
    @ResponseWrapper(localName = "TranslatorSentenceStringResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.TranslatorSentenceStringResponse")
    public ArrayOfString translatorSentenceString(
        @WebParam(name = "wordKey", targetNamespace = "http://WebXml.com.cn/")
        String wordKey);

    /**
     * <br /><h3>����ʶ�MP3�ֽ���</h3><p>���������Mp3 = Mp3���ƣ� �������ݣ��ֽ����� Byte[]��</p><br />
     * 
     * @param mp3
     * @return
     *     returns byte[]
     */
    @WebMethod(operationName = "GetMp3", action = "http://WebXml.com.cn/GetMp3")
    @WebResult(name = "GetMp3Result", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "GetMp3", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.GetMp3")
    @ResponseWrapper(localName = "GetMp3Response", targetNamespace = "http://WebXml.com.cn/", className = "cn.com.webxml.GetMp3Response")
    public byte[] getMp3(
        @WebParam(name = "Mp3", targetNamespace = "http://WebXml.com.cn/")
        String mp3);

}
