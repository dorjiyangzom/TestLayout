package com.example.testlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testlayout.ui.theme.TestLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestLayoutTheme {
                //layout component for material design
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Dorji",
//                        modifier = Modifier.padding(innerPadding)
                    Modifier.padding(innerPadding)
//                    SubjectColumn()
//                    SubjectRow()
//                   Notification()
//                    HorizontalGrid()
                    VerticalGrid()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestLayoutTheme {
        Greeting("Dorji")
    }
}

@Composable
fun Subject(subjectCode: String) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.Green),
        text = "Code of subject is: $subjectCode"
    )
}

@Preview(showBackground = true)
@Composable
fun SubjectPreview() {
    Subject("CP3406")
}
//column
@Composable

fun SubjectColumn() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Subject(subjectCode = "CP3406")
        Subject(subjectCode = "CP3406")
        Subject(subjectCode = "CP3406")
    }
}
@Preview(showBackground = true)
@Composable
fun SubjectColumnPreview() {
    SubjectColumn()
}

//row
@Composable
fun SubjectRow() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Subject(subjectCode = "CP3406")
        Subject(subjectCode = "CP3406")
        Subject(subjectCode = "CP3406")
    }
}
@Preview(showBackground = true)
@Composable
fun SubjectRowPreview() {
    SubjectRow()
}

//Box
@Composable
fun Notification() {
    Box(
        modifier = Modifier
            .size(100.dp),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier
                .size(80.dp),
            imageVector = Icons.Outlined.Notifications,
            contentDescription = null,
            tint = Color.Green
        )
        Text(text = "7")
    }
}
@Preview(showBackground = true)
@Composable
fun NotificationPreview() {
        Notification()
}

//list-lazycolumn

@Composable
fun ColumnList() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        items(100) {
            Text(
                modifier = Modifier
                    .padding(8.dp),
                text = "Item number $it"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnListPreview() {
    ColumnList()
}

//list-lazyrow

@Composable
fun RowList() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(8.dp)
    ) {
        items(100) {
            Text(
                modifier = Modifier
                    .padding(8.dp),
                text = "Item number $it"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RowListPreview() {
    RowList()
}

//lazy vertical grid
@Composable
fun VerticalGrid(){
    LazyVerticalGrid(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(8.dp),
        columns = GridCells.Fixed(3)
    ) {
        items(100) {
            Text(
                modifier = Modifier
                    .padding(8.dp),
                text = "Item number $it"
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HorizontalGridPreview() {
    HorizontalGrid()
}

//lazy horizontal grid
@Composable
fun HorizontalGrid(){
    LazyHorizontalGrid(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(8.dp),
        rows = GridCells.Fixed(3)
    ) {
        items(100) {
            Text(
                modifier = Modifier
                    .padding(8.dp),
                text = "Item number $it"
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun VerticalGridPreview() {
    VerticalGrid()
}