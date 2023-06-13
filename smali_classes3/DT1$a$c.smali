.class public final LDT1$a$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDT1$a;->bind(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "newValue",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIdentificationManualEntryFormAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$FormEditTextViewHolder$bind$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,238:1\n18#2:239\n9#3,4:240\n*S KotlinDebug\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$FormEditTextViewHolder$bind$2\n*L\n204#1:239\n204#1:240,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LDT1$a;

.field public final synthetic h:LDT1;


# direct methods
.method public constructor <init>(LDT1$a;LDT1;)V
    .locals 0

    iput-object p1, p0, LDT1$a$c;->g:LDT1$a;

    iput-object p2, p0, LDT1$a$c;->h:LDT1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LDT1$a$c;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 12

    iget-object v0, p0, LDT1$a$c;->g:LDT1$a;

    invoke-static {v0}, LDT1$a;->r(LDT1$a;)Lcc2;

    move-result-object v0

    iget-object v0, v0, Lcc2;->c:Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LDT1$a$c;->g:LDT1$a;

    invoke-virtual {v0}, Lh0;->getSafePosition()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, LDT1$a$c;->h:LDT1;

    invoke-static {v2}, LDT1;->access$getAdapterData(LDT1;)LE6;

    move-result-object v2

    invoke-virtual {v2, v0}, LE6;->e(I)LG6;

    move-result-object v3

    invoke-virtual {v3}, LG6;->c()Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, LlT1;

    if-eqz v4, :cond_0

    move-object v1, v2

    :cond_0
    move-object v4, v1

    check-cast v4, LlT1;

    if-eqz v4, :cond_2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x17

    const/4 v11, 0x0

    move-object v8, p1

    invoke-static/range {v4 .. v11}, LlT1;->copy$default(LlT1;Lco/bird/android/model/identification/IdentificationManualEntryFormField;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZILjava/lang/Object;)LlT1;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, LG6;->copy$default(LG6;Ljava/lang/Object;IZILjava/lang/Object;)LG6;

    move-result-object p1

    iget-object v1, p0, LDT1$a$c;->h:LDT1;

    invoke-static {v1}, LDT1;->access$getAdapterData(LDT1;)LE6;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, LE6;->l(ILG6;)Z

    :cond_2
    :goto_0
    return-void
.end method
