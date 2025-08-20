import os

# === Replacement Configuration ===
target_line = 'version = "1.0"'
replacement_line = 'version = "2.0"'
word_to_replace = 'gravel'
word_replacement = 'iron'

# === Recursive File Processing ===
for root, dirs, files in os.walk("."):
    for file in files:
        # ✅ Only process files with 'gravel' in the filename (case-sensitive)
        if word_to_replace in file:
            full_path = os.path.join(root, file)

            try:
                with open(full_path, 'r', encoding='utf-8') as f:
                    lines = f.readlines()

                new_lines = []
                for line in lines:
                    # Replace exact line match
                    if line.strip() == target_line:
                        line = replacement_line + "\n"
                    # Replace word 'gravel' with 'coal'
                    line = line.replace(word_to_replace, word_replacement)
                    new_lines.append(line)

                # === Change filename (remove .new) ===
                # Example: my_gravel_file.txt → my_coal_file.txt
                new_name = file.replace(word_to_replace, word_replacement)
                new_full_path = os.path.join(root, new_name)

                with open(new_full_path, 'w', encoding='utf-8') as f:
                    f.writelines(new_lines)

                print(f"✔ Replaced: {full_path} → {new_full_path}")

            except Exception as e:
                print(f"⚠ Failed to process {full_path}: {e}")
