# Coding problem of the 6th January 2020

## Details
- Asked by: Google
- Difficulty: Easy

## Problem

UTF-8 is a character encoding that maps each symbol to one, two, three, or four bytes.

For example, the Euro sign, corresponds to the three bytes: `11100010 10000010 10101100`.
The rules for mapping characters are as follows:
 - For a single-byte character, the first bit must be zero.
 - For an `n`-byte character, the first byte starts with `n` ones and a zero. The other `n - 1` bytes all start with `10`.

Write a program that takes in an array of integers representing byte values, and returns whether it is a valid UTF-8 encoding.

