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
<img src="https://user-images.githubusercontent.com/61208323/191785974-0e05cb20-e262-42b1-9477-18404fa1b8fa.gif" alt="PIP" style="width:200px;"/>
