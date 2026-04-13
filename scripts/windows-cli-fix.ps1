$ErrorActionPreference = "Stop"

Write-Host "== Cursor / VS Code CLI check (Windows) =="
Write-Host ""

function Show-Resolution($name) {
  Write-Host "where.exe $name"
  try {
    & where.exe $name
  } catch {
    Write-Host "(not found)"
  }
  Write-Host ""
}

Show-Resolution "code"
Show-Resolution "cursor"

Write-Host "Goal:"
Write-Host "- VS Code should open with:  code ."
Write-Host "- Cursor should open with:   cursor ."
Write-Host ""

Write-Host "If 'cursor' is missing:"
Write-Host "- In Cursor: Ctrl+Shift+P -> Shell Command: Install 'cursor' command (or 'Install command')"
Write-Host ""

Write-Host "If 'code' opens Cursor (or is missing):"
Write-Host "- In VS Code: Ctrl+Shift+P -> Shell Command: Install 'code' command"
Write-Host ""

Write-Host "After installing, close ALL terminals and open a new one."
