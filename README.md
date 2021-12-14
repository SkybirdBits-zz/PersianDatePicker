<h1 align="center">
 <a href="https://github.com/SkybirdBits/PersianDatePicker"> کتابخانه تقویم فارسی اندروید</a>
</h1>

یک کتابخانه ساده و کاربردی برای نمایش تقویم فارسی به صورت دیالوگ این کتابخانه همانند DatePicker در اندروید است که تاریخ شمسی را به صورت دیالوگ نمایش می دهد

Add library to the project
----

**مرحله اول**

ابتدا jitpack را به کل پروژه اضافه کنید

 فایل  **build.gradle** مربوط به روت پروژه کد زیر را وارد کنید


```
    allprojects {
        repositories {
            ...
            maven { url "https://jitpack.io" }
        }
   }‍‍‍
```

  نسخه های جدید اندروید استادیو فایل settings.gradle


```
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
```

**مرحله دوم**

  کتابخانه را اضافه کنید

  کد زیر را به فایل build.gradle مربوط به پوشه ی app قسمت dependencies اضافه کنید


```
  dependencies {
        implementation 'com.github.skybirdbits:persiandatepicker:0.0.2'
   }
 ```


Example
----

**ایجاد نمونه ی جدید**

 ```PersianDatePicker datePicker = new PersianDatePicker(context);```

 یا

 ```PersianDatePicker datePicker = new PersianDatePicker(context,viewGroup);```

**تنظیم حداقل و حداکثر تاریخ**

```
datePicker.updateMinYear(1360);
datePicker.updateMaxYear(1450);
```

**تنظیم modal دیالوگ**
```
datePicker.setDimAmount(0.5f);
```

**بستن Dialog و دریافت تاریخ با کلیک روی تایید**

```
private PersianCalendar calendar;
...
datePicker.setOnPositiveButtonClickListener(timeMillis -> calendar = new PersianCalendar(timeMillis));

```

**تنظیم زبان تقویم به فارسی و لاتین**

```
datePicker.setLanguageFarsi(true);
```

**نمایش تقویم**

```
datepicker.show()
```

نمونه
----
<img alt="sample" src="./sample.png" />
