// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.korioz.intellij.lua.psi.LuaTypes.*;
import com.korioz.intellij.lua.psi.*;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;
import com.korioz.intellij.lua.stubs.LuaPlaceholderStub;

public class LuaSingleArgImpl extends LuaArgsImpl implements LuaSingleArg {

  public LuaSingleArgImpl(@NotNull LuaPlaceholderStub stub, @NotNull IStubElementType<?, ?> type) {
    super(stub, type);
  }

  public LuaSingleArgImpl(@NotNull ASTNode node) {
    super(node);
  }

  public LuaSingleArgImpl(LuaPlaceholderStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  @Override
  public void accept(@NotNull LuaVisitor visitor) {
    visitor.visitSingleArg(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaVisitor) accept((LuaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LuaExpr getExpr() {
    return notNullChild(PsiTreeUtil.getStubChildOfType(this, LuaExpr.class));
  }

}