/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    n=n.toString();
    let product=1;
    for(let i=0;i<n.length;i++){
        product*=parseInt(n[i]);
    }
    let sum=0;
    for(let i=0;i<n.length;i++){
        sum+=parseInt(n[i]);
    }
    let result=product-sum;
    return result;
};