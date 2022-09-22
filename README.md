## Guidline
After creating your project, first of all you should define the PictureInPicture feature in activity, by using that, add these two lines to your ```AndroidManifest.xml``` file.   
```
<activity 
    android:name=".MainActivity"
    android:supportsPictureInPicture="true"
    android:configChanges="screenSize|smallestScreenSize|screenLayout|orientation"
    ...
```
then implement this feature in your activity.<br>   
### Showcase
<img src="https://user-images.githubusercontent.com/61208323/191778308-aabb82fb-5196-43ac-8cf7-95d102a5efe4.gif" alt="PIP" style="width:200px;"/>
