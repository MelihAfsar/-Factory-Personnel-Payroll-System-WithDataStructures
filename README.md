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
  
<h3><strong>Program??n Amac??</strong></h3>

  Fabrikan??n maddi y??netimi i??in; fabrika personelinin bilgilerinin tutulmas??, gerekli maa?? hesaplamalar??n??n yap??lmas?? ve takibi ??nemlidir. <br>
  Bu takibin kolay bir ??ekilde yap??labilmesi ve g??r??nt??leme imkanlar??n??n iyi olmas?? ??nem arz etmektedir.<br>
  Bu gerek??eleri d??????nd??????m??zde ihtiya??lar?? kar????layacak bir program yaz??lmal??d??r.<br>

<h3><strong>Yaz??l??m Tan??m??:</strong></h3>
  Program, Windows 11 (64 bit) i??letim sisteminde Apache NetBeans IDE ortam??nda Java 11 s??r??m?? ile geli??tirilmi??tir.<br>
  Veritaban?? i??in MySQL kullan??lm????t??r.<br>
  Aray??z java swing ile geli??tirilmi??tir.<br>

<h3><strong>Kullan??lan Veri Yap??lar?? Ve Algoritmalar</strong></h3>
<h4><i>1) LinkedList:</i></h4> Fabrika ??al????sanlar??n??n bilgileri, yaz??lan java program??nda kullan??lmak i??in veritaban??ndan ??ekilip Arraylist e kay??t etmek yerine 
LinkedList yap??s?? kullan??lm????t??r. Bu yap??n??n kullan??m amac?? PersonelView frame'inde ki??ilerin t??m bilgilerinin g??r??nt??lenmesi a??amas??nda tabloya s??rayla bilginin doldurulmas?? i??levi Arrayliste g??re daha performansl??d??r. Ancak dezavantaj olarak da hem nesne hem de nesnenin referans?? tutuldu??undan bellekte daha fazla yer kaplamaktad??r.

<h4><i>2) Queue:</i></h4>
Fabrikada olas?? i??lemlerin not edilmesi i??in kulland??????m??z Note frame'indeki tablo, silme i??levi ger??ekle??tirilmek istenirse  kuyruk yap??s??na g??re ilk giren ilk ????kar mant??????nda notlar silinmektedir.

<h4><i>3) Stack:</i></h4>
Fabrikada olas?? i??lemlerin not edilmesi i??in kulland??????m??z Note frame'indeki tablo, silme i??levi ger??ekle??tirilmek istenirse  Stack yap??s??na g??re son giren ilk ????kar mant??????nda notlar silinmektedir.

<h4><i>4) Merge Sort:</i></h4>
Fabrikada ??al????anlar??n g??r??nt??lendi??i view frame'inde ki??ileri ald??klar?? maa?? miktar?? k??????kten b??y????e s??ralama i??lemini en k??t?? durumda nlogn karma????kl????a sahip merge sort algoritma??n?? kullanarak ger??ekle??tirdik.

<h4><i>5) Interpolation Search:</i></h4>
Fabrikada ??al????anlar??n g??r??nt??lendi??i view frame'inde ki??ileri regex kullanarak anl??k olarak araman??n yan??nda id numaras?? ile de arama i??lemini en k??sa zamanda ger??ekle??tirmek i??in ki??ilerin de id de??erleri s??ral?? ve ard??????k olarak artt??????ndan ortalama de??erde loglogn karma????kl????a, en k??t?? durumda n karma????kl????a ve uzay karma????l??????na (1) sahip olan interpolation search kulland??k.

<h3>Not:</h3>
  Programdaki veritaban?? i??lemlerinin do??ru ??al????abilmesi i??in veritaban??n??n projeye dahil edilmesi gerekmektedir. <br>
  Program i??in gereksinimleri kar????lad??ktan sonra <em>frmLogin</em> class'??ndan ??al????t??rabilirsiniz. <br>
