package main
import (
	"encoding/csv"
	"fmt"
	"os"
  )
  func main() {
	// open CSV file
	fd, error := os.Open("./data.csv")
	if error != nil {
	  fmt.Println(error)
	}
	fmt.Println("Successfully opened the CSV file")
	defer fd.Close()
	  
	// read CSV file
	fileReader := csv.NewReader(fd)
	records, error := fileReader.ReadAll()
	if error != nil {
		fmt.Println(error)
	}
	fmt.Println(records)
}