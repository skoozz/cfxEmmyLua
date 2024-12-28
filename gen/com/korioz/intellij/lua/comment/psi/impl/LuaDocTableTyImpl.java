// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.comment.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.korioz.intellij.lua.comment.psi.LuaDocTypes.*;
import com.korioz.intellij.lua.comment.psi.*;
import com.korioz.intellij.lua.ty.ITy;

public class LuaDocTableTyImpl extends LuaDocTyImpl implements LuaDocTableTy {

  public LuaDocTableTyImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull LuaDocVisitor visitor) {
    visitor.visitTableTy(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaDocVisitor) accept((LuaDocVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LuaDocTableDef getTableDef() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, LuaDocTableDef.class));
  }

  @Override
  @NotNull
  public ITy getType() {
    return LuaDocPsiImplUtilKt.getType(this);
  }

}