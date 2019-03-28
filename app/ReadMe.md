ListView:
List view is a big table that shows a large number of data with scrolling option.

in IOS it is the same thing as table. but working with list view is easier.

This is how we are going to use Listview

1)  go to design view and in the palette add Listview to activity.
2)  give it an id.
3)  go to mainactivity.java and start coding
4)  onCreate we create a listview variable:
    ListView listview= findViewById(R.id.myListView);
5)  create a Arraylist of names
    ArrayList<String> myFamily = new ArrayList<String>();
    myFamily.add("Mohammad");
    myFamily.add("Faeze");
    myFamily.add("Mostafa");
6)  adding the arraylist to the listview.
    to do so we need something called ArrayAdapter, and this is something that allow us to 
    to convert our arraylist to diffrent format. in this case we are going to convert it to listview.
    
    ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, myFamily);
    
7)  apply arrayadapter to listview.
    listView.setAdapter(arrayAdapter);
    
INTERACTING WITH THE LISTVIEW:

1) set onItemClickListener for the listview.
     AdapterView<?> : essentially this is the listview that is clicked at. it is called adapter because it is not only list view, it can be a spinner or gridview or anything else.
        this is a generic because we don't know what type it is and in this case it is called parrent. so if we want to do anything with the whole list view we can work with this
        parent.
    
    View:   represent the thing that is clicked at. in this case it is the rows.
    
    position:   is the number of the row that is tapped.
    
    id: in this case it is the same as position but in somecase it is diffrent.
    
2)  get information we want with position and the myFamily arraylist.




    
    
