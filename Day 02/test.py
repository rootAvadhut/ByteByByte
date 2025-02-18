from markdown2 import markdown
from weasyprint import HTML

# Load the Markdown file
md_file_path = "How JS Code Excuted.md"
pdf_file_path = "How_JS_Code_Executed.pdf"

with open(md_file_path, "r", encoding="utf-8") as md_file:
    md_content = md_file.read()

# Convert Markdown to HTML
html_content = markdown(md_content)

# Convert HTML to PDF
HTML(string=html_content).write_pdf(pdf_file_path)

# Provide the download link
pdf_file_path
