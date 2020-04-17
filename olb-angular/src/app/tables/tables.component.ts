import { Component, OnInit } from '@angular/core';

declare interface TableData {
    headerRow: string[];
    dataRows: string[][];
}

@Component({
  selector: 'app-tables',
  templateUrl: './tables.component.html',
  styleUrls: ['./tables.component.css']
})
export class TablesComponent implements OnInit {
    public tableData1: TableData;
    public tableData2: TableData;

  constructor() { }

  ngOnInit() {
      this.tableData1 = {
          headerRow: [ 'ID', 'Name', 'Branch', 'Amout', 'Date'],
          dataRows: [
              ['1', 'Nagaraju JVL', 'HDFC', '$100', '04-04-2020'],
              ['2', 'Krishna', 'SBI', '$200', '06-04-2020'],
              ['3', 'Mahir Ali', 'ICICI', '$1000', '07-04-2020'],
              ['4', 'Rakesh', 'Axis', '$500', '08-04-2020'],
              ['5', 'Ajit Kumar', 'Yes Bank', '$200', '13-04-2020'],
              ['6', 'Ramesh Nalluri', 'Yes Bank', '$150.50', '13-04-2020']
          ]
      };
  }

}
