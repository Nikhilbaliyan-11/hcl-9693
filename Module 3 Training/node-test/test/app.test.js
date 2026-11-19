import { greet, greetInHindi } from "../app.js";
import { describe, test } from "node:test";
import assert from "node:assert";


describe("order feature", ()=>{
  test("that it process the order correctly", ()=> {
    const mockedProcessPayment = mock.fn((amount)=> {
      console.log("i am mocked process payment fucntion");
      return {id: "123" , amount};


    });
    const expected = {id:"123", amount:5000};
    const actual = processOrder(
        {amount:5000},
        {mockedProcessPayment: mockedProcessPayment},
    );
    assert.deepStrictEqual(actual, expected);
  })
})
describe("Greeting functions", () => {
  test("greet returns the correct greeting", () => {
    const expected = `Hello, World!`;
    const actual = greet("World");

    assert.strictEqual(actual, expected);
  });

  test("greet returns in hindi", () => {
    const expected = `Namaste, Duniya!`;
    const actual = greetInHindi("Duniya");
    assert.strictEqual(actual, expected);
  });
});
