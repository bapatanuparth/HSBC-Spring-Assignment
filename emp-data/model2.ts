export class Module {
    items
    constructor() {
  
      this.items = [new employee("1","aaa","20000","TSE"),
      new employee("2","bbb","20000","TSE"),
      new employee("3","ccc","40000","SSE"),
      new employee("4","ddd","40000","SSE")]
    }
    
  }
  
  export class employee {
    empno;
    ename;
    sal;
    desig;
    constructor(empno,ename,sal,desig) {
      this.empno = empno;
      this.ename = ename;
      this.sal=sal;
      this.desig=desig;
    }
  }
  
  