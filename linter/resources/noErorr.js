function and(a,b) {
    if (a === 1 && b === 1) {
        return 1;
    } else {
        return 0;
    }
}
onsole.log("zadd1 000", zadd1(0, 0,0));
console.log("zadd1 001", zadd1(0, 0,1));
console.log("zadd1 010", zadd1(0, 1,0));
console.log("zadd1 011", zadd1(0, 1,1));