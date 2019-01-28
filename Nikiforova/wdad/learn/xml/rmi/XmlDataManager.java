package Rpis61.Nikiforova.wdad.learn.xml.rmi;

import Rpis61.Nikiforova.wdad.learn.xml.Reader;
import java.awt.print.Book;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface XmlDataManager extends Remote {

    public List<Reader> negligentReaders() throws RemoteException;
    public void removeBook (Reader reader, Book book)throws RemoteException;
    public void addBook (Reader reader, Book book)throws RemoteException;
    public HashMap<Book, Date> getDateReturn (Reader reader)throws RemoteException;
    public List<Reader> getReaders() throws RemoteException;
}