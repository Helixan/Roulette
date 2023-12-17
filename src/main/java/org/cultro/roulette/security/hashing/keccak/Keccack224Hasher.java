package org.cultro.roulette.security.hashing.keccak;

import org.bouncycastle.crypto.digests.KeccakDigest;
import org.cultro.roulette.security.hashing.Hash;
import org.cultro.roulette.security.hashing.HashAlgorithm;

/**
 * This class implements the Hash interface using the Keccak-224 hashing algorithm.
 * It offers methods for computing hash digests with a 224-bit output, providing a balance between security and efficiency.
 */
public class Keccack224Hasher implements Hash {

    private final KeccakDigest keccakDigest;


    /**
     * Constructs a new Keccack224Hasher by initializing the Keccak-224 hashing algorithm.
     */
    public Keccack224Hasher() {
        this.keccakDigest = new KeccakDigest(224);
    }


    /**
     * Computes the hash digest of the given input using the Keccak-224 algorithm.
     * This method updates the digest with the input byte array and then finalizes the hash computation.
     *
     * @param input The byte array to be hashed.
     * @return The hashed byte array (28 bytes).
     */
    @Override
    public byte[] digest(byte[] input) {
        keccakDigest.update(input, 0, input.length);
        byte[] out = new byte[keccakDigest.getDigestSize()];
        keccakDigest.doFinal(out, 0);
        return out;
    }


    /**
     * Computes the hash digest of the given input, concatenating with the provided salt, using the Keccak-224 algorithm.
     * This method first combines the input array and salt array before performing the hash computation.
     *
     * @param input The byte array to be hashed.
     * @param salt  The salt to be appended to the input before hashing.
     * @return The hashed byte array (28 bytes).
     */
    @Override
    public byte[] digest(byte[] input, byte[] salt) {
        byte[] combinedInput = new byte[input.length + salt.length];
        System.arraycopy(input, 0, combinedInput, 0, input.length);
        System.arraycopy(salt, 0, combinedInput, input.length, salt.length);

        return digest(combinedInput);
    }


    /**
     * Retrieves the specific hashing algorithm used by this Keccack224 hasher.
     *
     * @return The hashing algorithm, KECCACK_224.
     */
    @Override
    public HashAlgorithm getHashAlgorithm() {
        return HashAlgorithm.KECCACK_224;
    }


    /**
     * Retrieves the length of the hash produced by this Keccack224 hasher.
     * KECCACK_224 generates a hash of 28 bytes.
     *
     * @return The length of the hash in bytes (28 bytes).
     */
    @Override
    public int getHashLength() {
        return 28;
    }
}
