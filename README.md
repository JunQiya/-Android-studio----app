###  **Android期末作业《影视分享App》项目报告** 
### 仅供个人学习使用

 **一、页面结构：** 
1、App主页
2、App侧边栏
3、最新上映页面
4、即将上映页面
5、欧美排行页面
6、系统设置页面
7、业务逻辑页面-点击效果-点击进入个人网站（lxxno.cn-追寻自己）
8、点击进入电影详细页面
9、App应用图标-名字
 **二、项目用到的部分元素组件** 

```
一、
<!--        绑定注册YourNewActivity的点击事件-->
        <activity android:name=".YourNewActivity">
            
        </activity>

二、
//点击后启动系统自带浏览器访问此网站
public void openWebPage(View view) {
    Uri uri = Uri.parse("https://www.lxxno.cn"); // 替换为想要跳转的网页链接
    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    startActivity(intent);
}
三、

//点击跳转到电影详细页面
// 添加点击事件处理方法
public void onImageViewClick(View view) {
    // 在这里执行点击事件的逻辑
    // 例如，启动一个新的 Activity
    Intent intent = new Intent(this, YourNewActivity.class);
    startActivity(intent);
}

```
 **四、主页布局组件结构** 

![输入图片说明](https://foruda.gitee.com/images/1706249793389432682/301a0b99_13851160.png "屏幕截图")
![输入图片说明](https://foruda.gitee.com/images/1706249801523716321/bb49f094_13851160.png "屏幕截图")

 **三、App打包成Apk文件：（没有Android设备无法进行预览）** 
Apk文件路径： qimoapp-1\movieshare\app\release

![输入图片说明](https://foruda.gitee.com/images/1706249830994659864/a031aea1_13851160.png "屏幕截图")

### 影视分享App运行截图

1、App主页
![输入图片说明](https://foruda.gitee.com/images/1706249865994135045/9f6bcf85_13851160.png "屏幕截图")
![输入图片说明](https://foruda.gitee.com/images/1706249873948379330/0aa5da4f_13851160.png "屏幕截图")
![输入图片说明](https://foruda.gitee.com/images/1706249881694148797/9c7ba96b_13851160.png "屏幕截图")

2、App侧边栏

![输入图片说明](https://foruda.gitee.com/images/1706249962155039057/359ce22d_13851160.png "屏幕截图")

3、最新上映页面

![输入图片说明](https://foruda.gitee.com/images/1706249977828066846/f8fdbec6_13851160.png "屏幕截图")
![输入图片说明](https://foruda.gitee.com/images/1706249989866815278/eb2be0a5_13851160.png "屏幕截图")

4、即将上映页面

![输入图片说明](https://foruda.gitee.com/images/1706250008119780848/0af7949c_13851160.png "屏幕截图")
![输入图片说明](https://foruda.gitee.com/images/1706250020498713857/e509570f_13851160.png "屏幕截图")

5、欧美排行

![输入图片说明](https://foruda.gitee.com/images/1706250041788459019/c6a7971b_13851160.png "屏幕截图")
![输入图片说明](https://foruda.gitee.com/images/1706250049521767681/76174d22_13851160.png "屏幕截图")

6、我的收藏

![输入图片说明](https://foruda.gitee.com/images/1706250063731193656/8fa4d496_13851160.png "屏幕截图")
![输入图片说明](https://foruda.gitee.com/images/1706250075709846317/85118815_13851160.png "屏幕截图")
![输入图片说明](https://foruda.gitee.com/images/1706250083129788200/e102ff7b_13851160.png "屏幕截图")

7、系统设置页面

![输入图片说明](https://foruda.gitee.com/images/1706250103004689105/37f11d91_13851160.png "屏幕截图")
![输入图片说明](https://foruda.gitee.com/images/1706250120228567687/922dd774_13851160.png "屏幕截图")

7、业务逻辑页面-点击效果

![输入图片说明](https://foruda.gitee.com/images/1706250150580467544/0cf6f115_13851160.png "屏幕截图")

以下此页面点击自动启动默认手机客户端浏览器 
进行浏览网页 lxxno.cn-追寻自己https://www.lxxno.cn/
![输入图片说明](https://foruda.gitee.com/images/1706250227246567370/34531088_13851160.png "屏幕截图")

8、点击进入电影详细页面
以下页面均为点击电影 进入电影详细页面

![输入图片说明](https://foruda.gitee.com/images/1706250245351268043/9a93a89a_13851160.png "屏幕截图")
![输入图片说明](https://foruda.gitee.com/images/1706250252052404226/ea30633b_13851160.png "屏幕截图")
![输入图片说明](https://foruda.gitee.com/images/1706250258894569286/a8791e38_13851160.png "屏幕截图")
![输入图片说明](https://foruda.gitee.com/images/1706250274092096729/3777a2da_13851160.png "屏幕截图")

9、App应用图标-名字
![输入图片说明](https://foruda.gitee.com/images/1706250327068780373/22ccc967_13851160.png "屏幕截图")
代码：
![输入图片说明](https://foruda.gitee.com/images/1706250358172263925/af87a0c3_13851160.png "屏幕截图")