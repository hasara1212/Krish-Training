function sort(a) {
    
    for (i = 0; i < a.length; i++) {
        for (j = 0; j < a.length; j++) {
            if (a[j] > a[i]) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    return a.join("");
}

function anagramchecker(wrd1, wrd2){

    let str1=wrd1.replace(' ', '').toLowerCase().split('')
    let sortedsrt1=sort(str1)

    let str2=wrd2.replace(' ', '').toLowerCase().split('')
    let sortedsrt2=sort(str2)
    
    if(sortedsrt1 === sortedsrt2){
      return(`Entered ${wrd1} and ${wrd2} Words are Anagrams...`)
    }else{
      return(`Entered ${wrd1} and ${wrd2} Words are not Anagrams...`)
    }
  }

const readline = require('readline')

const rdline = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rdline.question(" Enter your first word : ", fiword => {
  rdline.question(" Enter your second word : ", seword => {
      console.log(anagramchecker(fiword,seword))
      rdline.close();
  });
});

rdline.on("close", function() {
  process.exit(0);
});
  