# Factory-Personnel-Payroll-System

<strong> -- EN -- </strong>

<h3>Purpose of the Program:</h3>

  For the management of the factory; It is important to keep the information of the factory personnel, to make and follow the necessary salary calculations. <br>
  It is important that this follow-up can be done easily and that the imaging is good.<br>
  A program should be written for these reasons.  <br>
  
  <h3><strong>Software Description:</strong></h3>
  The program was developed in the Apache NetBeans IDE environment with the Java 11 version on the Windows 11 operating system. <br>
  MySQL is used for the database.<br>
  The interface is developed with java swing.<br>
  
  <h3><strong>Project Images</strong></h3>
  
  <h4><strong>frmLogin</strong></h4>
  
  ![LoginScreen](https://user-images.githubusercontent.com/77414773/149290147-b7302950-f041-4fec-9eb8-1b597ac7daec.png)

  <h4><strong>frmHomePage</strong></h4>
  
  ![Home](https://user-images.githubusercontent.com/77414773/149290401-1c3bb147-c1e7-49cd-9695-2eb345b2283b.png)
  
  <h4><strong>frmNotesPage</strong></h4>
  
  ![note](https://user-images.githubusercontent.com/77414773/170859832-7618131e-3fcf-4549-a2ef-bbcaf7c2ed58.png)

  <h4><strong>frmPersonnelAdd</strong></h4>
  
  ![add](https://user-images.githubusercontent.com/77414773/149291099-e9539003-5c3f-4eb9-92c9-29cbdc1956a6.png)
  
  <h4><strong>frmPersonnelUpdate</strong></h4>
  
  ![Update](https://user-images.githubusercontent.com/77414773/149291135-18602cf1-d1cd-4ae1-84ad-f53c7de829d1.png)

  <h4><strong>frmPersonViewing</strong></h4>
  
  ![view](https://user-images.githubusercontent.com/77414773/170859815-d59ac8c5-2d83-4b4f-b557-a8c3ff8f0fe8.png)

  <h4><strong>frmPersonnelRemove</strong></h4>
  
  ![remove](https://user-images.githubusercontent.com/77414773/149291199-f85d2ea0-bace-4c08-8690-0cd8cccd2b6b.png)

  <h4><strong>frmAdminMenu</strong></h4>
  
  ![admin](https://user-images.githubusercontent.com/77414773/170859839-5ede17e1-80ae-4507-abbe-c6f9fcb57766.png)


<h3>Note:</h3>
In order for the database operations in the program to work correctly, the database must be included in the project. <br>
You can run the program from the frmLogin class after the conditions are met.<br>

<hr> </hr><br>


<strong> -- TR -- </strong>
  
<h3><strong>Programın Amacı</strong></h3>

  Fabrikanın maddi yönetimi için; fabrika personelinin bilgilerinin tutulması, gerekli maaş hesaplamalarının yapılması ve takibi önemlidir. <br>
  Bu takibin kolay bir şekilde yapılabilmesi ve görüntüleme imkanlarının iyi olması önem arz etmektedir.<br>
  Bu gerekçeleri düşündüğümüzde ihtiyaçları karşılayacak bir program yazılmalıdır.<br>

<h3><strong>Yazılım Tanımı:</strong></h3>
  Program, Windows 11 (64 bit) işletim sisteminde Apache NetBeans IDE ortamında Java 11 sürümü ile geliştirilmiştir.<br>
  Veritabanı için MySQL kullanılmıştır.<br>
  Arayüz java swing ile geliştirilmiştir.<br>

<h3><strong>Kullanılan Veri Yapıları Ve Algoritmalar</strong></h3>
<h4><i>1) LinkedList:</i></h4> Fabrika çalışsanlarının bilgileri, yazılan java programında kullanılmak için veritabanından çekilip Arraylist e kayıt etmek yerine 
LinkedList yapısı kullanılmıştır. Bu yapının kullanım amacı PersonelView frame'inde kişilerin tüm bilgilerinin görüntülenmesi aşamasında tabloya sırayla bilginin doldurulması işlevi Arrayliste göre daha performanslıdır. Ancak dezavantaj olarak da hem nesne hem de nesnenin referansı tutulduğundan bellekte daha fazla yer kaplamaktadır.

<h4><i>2) Queue:</i></h4>
Fabrikada olası işlemlerin not edilmesi için kullandığımız Note frame'indeki tablo, silme işlevi gerçekleştirilmek istenirse  kuyruk yapısına göre ilk giren ilk çıkar mantığında notlar silinmektedir.

<h4><i>3) Stack:</i></h4>
Fabrikada olası işlemlerin not edilmesi için kullandığımız Note frame'indeki tablo, silme işlevi gerçekleştirilmek istenirse  Stack yapısına göre son giren ilk çıkar mantığında notlar silinmektedir.

<h4><i>4) Merge Sort:</i></h4>
Fabrikada çalışanların görüntülendiği view frame'inde kişileri aldıkları maaş miktarı küçükten büyüğe sıralama işlemini en kötü durumda nlogn karmaşıklığa sahip merge sort algoritmaını kullanarak gerçekleştirdik.

<h4><i>5) Interpolation Search:</i></h4>
Fabrikada çalışanların görüntülendiği view frame'inde kişileri regex kullanarak anlık olarak aramanın yanında id numarası ile de arama işlemini en kısa zamanda gerçekleştirmek için kişilerin de id değerleri sıralı ve ardışık olarak arttığından ortalama değerde loglogn karmaşıklığa, en kötü durumda n karmaşıklığa ve uzay karmaşılığına (1) sahip olan interpolation search kullandık.

<h3>Not:</h3>
  Programdaki veritabanı işlemlerinin doğru çalışabilmesi için veritabanının projeye dahil edilmesi gerekmektedir. <br>
  Program için gereksinimleri karşıladıktan sonra <em>frmLogin</em> class'ından çalıştırabilirsiniz. <br>
