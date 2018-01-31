# Rocker-demo  

Custom view implementing rocker operation and real-time angle callback via Kotlin  

# Deployment  

## XML  

  ```HTML
  <?xml version="1.0" encoding="utf-8"?>
  <resources>
      <attr name="InnerColor" format="color"/>
      <attr name="OuterColor" format="color"/>
      <declare-styleable name="RockerView">
          <attr name="InnerColor"/>
          <attr name="OuterColor"/>
      </declare-styleable>
  </resources>
  ```   
  
Add the above code to the attrs.xml file in the following directory (create one if not exist):  
  
  ```YOUR_PROJECT/app/src/main/res/values/```  
  
## GRADLE  
  
Add the following dependencies to your project build gradle file:  

  ```gradle
  classpath "org.jetbrains.kotlin:kotlin-android-extensions:$kotlin_version"
  ```  
  
## SRC  
  
Copy the package```rocker-demo/app/src/main/java/tech```to your source directory  
(You can just delete the MainActivity.kt file)
  
# Usage

## Widget  

  ```XML
  <tech.elecholic.rocker.RockerView
        android:id="@+id/rockerView"
        android:layout_width="match_parent"
        android:layout_height="100dp" />
  ```  
  
## Callback function  
  
  ```Kotlin
  rockerView.setOnAngleChangedListener(object: RockerView.OnAngleChangedListener {
            override fun onAngleChanged(ang: Float) {
                // angleView.text = ang.toString()
                // Do what you want with angle when rocker moved
            }
        })
  ```  
  
# 摇杆演示  

Kotlin下自定义控件实现摇杆操作及实时角度回调 
  
# 部署  
  
## XML  
  
  ```HTML
  <?xml version="1.0" encoding="utf-8"?>
  <resources>
      <attr name="InnerColor" format="color"/>
      <attr name="OuterColor" format="color"/>
      <declare-styleable name="RockerView">
          <attr name="InnerColor"/>
          <attr name="OuterColor"/>
      </declare-styleable>
  </resources>
  ```  
  
将如上代码加入到以下目录下的attrs.xml中（如无则创建）：  
  
  ```YOUR_PROJECT/app/src/main/res/values/```  
  
  
## GRADLE  
  
添加以下依赖到project的gradle下:  

```gradle
classpath "org.jetbrains.kotlin:kotlin-android-extensions:$kotlin_version"
```  
  
## SRC  
  
复制包```rocker-demo/app/src/main/java/tech```到项目源目录下    
(MainActivity.kt文件可删)
  
# 使用  

## 控件  

  ```XML
  <tech.elecholic.rocker.RockerView
        android:id="@+id/rockerView"
        android:layout_width="match_parent"
        android:layout_height="100dp" />
  ```  

## 回调函数  

  ```Kotlin
  rockerView.setOnAngleChangedListener(object: RockerView.OnAngleChangedListener {
            override fun onAngleChanged(ang: Float) {
                // angleView.text = ang.toString()
                // Do what you want with angle when rocker moved
            }
        })
  ```  
  
