package Rpis61.Nikiforova.wdad.learn.xml.rmi;

import Rpis61.Nikiforova.wdad.learn.xml.Book;
import Rpis61.Nikiforova.wdad.learn.xml.Reader;
import Rpis61.Nikiforova.wdad.learn.xml.XmlTask;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class XmlDataManagerImpl implements Serializable {
    private XmlTask xmlTask;

    XmlDataManagerImpl() throws RemoteException {
        xmlTask = new XmlTask();
    }


    public List<Reader> getReaders() throws RemoteException {
        return xmlTask.getReaders();
    }


    public List<Reader> negligentReaders() throws RemoteException {
        return xmlTask.negligentReaders();
    }


    public void removeBook(Reader reader, Book book)throws RemoteException {
        xmlTask.removeBook(reader,book);
    }

    public void addBook(Reader reader, Book book) throws RemoteException {
        xmlTask.addBook(reader,book);
    }


}
