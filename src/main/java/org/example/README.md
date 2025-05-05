## 1-Savol. Thread nima?
###  Thread bu bitta protsess ichida eng kichiq oqim. Bizlar threadlar orqali dasturni bir vaqtni o'zida bir necha vazifalarni bajarishga erishamiz.
****
#####
## 2-Savol. Multithreading va Multitaskingni farqi nimada?
### Multithreading va multitasking - bu dasturlash metodlaridir. Multithreading - dasturni bir nechta threadlardan iborat bajarishdir. Multitasking - dasturni bir nechta vazifalardan iborat bajarishdir.
***
#####
## 3-Savol. ThreadPool nima?
### ThreadPool - threadlar to'plami. Biz ThreadPool-ni yaratish uchun ThreadPoolExecutor yordamida threadlar to'plamini yaratib olamiz. Bu yerda threadlarni biz o'zimiz nechta yaratilishini aytib ketamiz, va ularning qaysi biri IDLE holatida bolsa ana osha thread yangi kelgan taskni bajaradi, bajarib bolishadanoq u yana idle holatga o'tadi.
***
#####
## 4-Savol. Callable va Runnable farqi va qachon nima uchun ishlatilinadi?
### Callable - interface, Runnable - interface. Callable - barcha metodlarni qabul qilish uchun ishlatiladi, Runnable - metodlarni qabul qilish uchun ishlatiladi.
***
#####
## 5-Savol. Future nima va qachon ishlatiladi?
### Future - barcha metodlarni qabul qilish uchun ishlatiladi. Future-ni ishlatish uchun FutureTask yordamida yaratiladi. FutureTask - Runnable va Callable interfeyslariga berilgan metodlarni qabul qilish uchun ishlatiladi.
***
#####
## 6-Savol. Future va CompetableFuture ning farqi?
### Future - barcha metodlarni qabul qilish uchun ishlatiladi. CompetableFuture -Future-ni kutish uchun ishlatiladi. CompetableFuture - Future va Runnable interfeyslariga berilgan metodlarni qabul qilish uchun ishlatiladi.
***
#####
## 7-Savol. Volatile non-access modificatori haqida malumot bering. Nima uchun ishlatilinadi.
### Volatile non-access modificatori - o'zgaruvchilar uchun ishlatiladi. Qachonki bizlar volatile kalit sozini yozib ketsak keshda emas MainMemory da saqlaydi. Va bu biznish CPU tolib ketishini oldini olishi uchun hizmat qiladi.
***
#####
## 8-Savol. Immutable classlar nima uchun kerak va immutable class yaratishimiz uchun qanday shartlar bajarilishi kerak?
### Immutable class tushunchasi Immutable class — bu obyekt yaratilgandan keyin uning qiymatlari o‘zgartirilmaydigan klass. Ya’ni, obyekt bir marta yaratiladi va undan keyin o‘zgartirishga yo‘l qo‘yilmaydi. Immutable classlar ko‘pincha thread-safe bo‘lib, ko‘p oqimli (multi-threaded) muhitda data corruption (ma’lumot buzilishi) ni oldini oladi.  Masalan: String, Integer, LocalDateTime, BigDecimal immutable klasslardir.
***
#####
## 9-Savol. Asynchrone programming nima?
### Asinxron dasturlash — bu kodni bloklamasdan bajarish usuli bo‘lib, ayni paytda boshqa vazifalar ham bajarilishi mumkin. Sinxron dasturlash da kod qatorma-qator bajariladi va har bir vazifa oldingi vazifa tugaguncha kutib turadi. Asinxron dasturlash da esa vazifalar fon rejimida bajariladi, shu sababli boshqa vazifalar ham kutib o‘tirmasdan bajarilaveradi.
***
#####
## 10-Savol. Atomic classlar qanday algoritim orqali race conditionni oldini oladi? Yoki thread-safe?
### Atomic classlar CAS (Compare-And-Swap) algoritmi yordamida thread-safe bo'lib, race conditionni oldini oladi. CAS algoritmi odatda asosiy hisob-kitoblar va ko'nikmalar bilan amalga oshiriladi, bu esa bir operatsiyani o'tish paytida boshqa threadlar tomonidan o'zgartirilganligini tekshirib, faqat agar o'zgarish bo'lmasa, uning qiymatini yangilaydi.
***
#####
## 11-Savol. Serialazition/deserialazition nima?
### Serializatsiya/deserializatsiya — bu ob'yectlarni byte qatoriga o'tkazish (serializatsiya) va uni qayta ob'ektga aylantirish (deserializatsiya) jarayoni. Bu ob'yectlarni saqlash, uzak tarmoq o'tkazish yoki o'zaro tarqatish uchun ishlatiladi.
***
#####
## 12-Savol. 
### Serializable: Standart serializatsiya protokolidan foydalanadi. Ob'yectning hamma maydonlari avtomatik tarzda saqlanadi yoki qayta tiklanadi.
### Externalizable: Qo'shimcha kontrollga imkon beradi. Ob'yectning serializatsiyasi va deserializatsiyasi to'liq o'zgartirilishi mumkin. writeExternal va readExternal metodlarini ko'rsatish talab etiladi.
### Xususiy farqlar:
### Serializable aniqlanmagan maydonlarni avtomatik tarzda saqlaydi.
### Externalizable ob'yectni to'liq qayta tizilish jarayonini boshqarish imkonini beradi.
***
#####
## 13-Savol. ReentrentLock haqida malumot bering.
### ReentrantLock — Java-da qayta kira olinadigan thread-safe. U tryLock va lockInterruptibly metodlarini taqdim etadi va kodni asinxron ishlovda xavfsizlikka ta'minlaydi.
#### Misol:
```
ReentrantLock lock = new ReentrantLock();
lock.lock();
try {
    // thread-safe operatsiyalar
} finally {
    lock.unlock();
}
```

***
#####
## 14-Savol. Logging Nima?
### Logging — bu dasturning ishlash jarayonini, xatolarni va muammoni aniqlash uchun ma'lumotlarni yozish jarayoni. Dasturning vazifalari, holati va xatolarni kuzatish uchun ishlatiladi.
***
#####
## 15-Savol. Daemon thread nima?
### Daemon thread — bu faol davom etishi mumkin bo'lgan, lekin dasturning boshqa non-daemon threadlari tugagandan keyin avtomatik ravishda tugaydigan thread. Daemon threadlar odatda fon ishlovchi jarayonlar (masalan, garbage collector) uchun ishlatiladi.
***
#####
## 16-Savol. Jar file nima?
### Jar file — bu Java Archive fayli bo'lib, Java klaslarini, resurs fayllarini va meta-ma'lumotlarni bir faylda saqlash uchun ishlatiladi.
***
#####
## 17-Savol. Maven nima?
### Maven — bu Java dasturlash jarayonini avtomatlashtirish uchun ishlatiladigan build va dependency management vositasidir. U dasturni tuzish, test qilish, o'rnatish va paketlash uchun ishlatiladi.
***
#####
## 18-Savol. Behavior Parameterization nima?
### Behavior Parameterization — bu dasturlash usuli bo'lib, Biz methodlarni parametr sifatida berib yuborishimiz va kodga bajarilishi kerak bo'lgan xatolarni yoki funksiyalarni o'tish orqali uzatishga imkon beradi. Bu metodlar yordamida kodni yanada moslashuvchan va takomillashtirishga osonlashtirish mumkin.
***
#####
## 19-Savol.  Declarative va Imperative programming nima?
### Declarative programming — bu kodni nechta bajarilishi kerakligini o'z ichiga oladi, kim qanday bajarishini ishoratlash emas. Misol uchun, SQL.
### Imperative programming — bu kodni kim qanday bajarishi kerakligini o'z ichiga oladi, yani bajarilish jarayonini qisqaroq ma'lumotlarda ko'rsatish emas. Misol uchun, Java, C++.
***
#####
## 20-Savol.  Stream nima? Stream va Collection larning farqi nimada?
### Stream — bu ma'lumotlar oqish jarayoni bo'lib, oqiladigan ma'lumotlar jadvalidir.
### Stream va Collection farqlari:
### Collection: ma'lumotlar to'plami, o'z ichiga oladi va saqlaydi.
### Stream: ma'lumotlarni oqish va boshqarish jarayoni, o'z ichiga olmaydi, faqat oqadi.


