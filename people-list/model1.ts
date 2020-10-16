export class Module {
    items
    constructor() {
  
      this.items = [new people("aaa","20","Male"),
      new people("bbb","25","Female"),
      new people("ccc","23","Female"),
      new people("ddd","30","Male")]
    }
    
  }
  
  export class people {
    name;
    age;
    gender;
    constructor(name,age,gender) {
      this.name = name;
      this.age = age;
      this.gender=gender;
    }
  }
  
  