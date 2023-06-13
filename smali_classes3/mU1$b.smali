.class public final LmU1$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmU1;->c(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)LH6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LG6;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LG6;",
        "b",
        "()LG6;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

.field public final synthetic h:LmU1;

.field public final synthetic i:Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

.field public final synthetic j:Lco/bird/android/model/identification/IdentificationManualEntryFormData;


# direct methods
.method public constructor <init>(Lco/bird/android/model/identification/IdentificationManualEntryFormField;LmU1;Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;)V
    .locals 0

    iput-object p1, p0, LmU1$b;->g:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    iput-object p2, p0, LmU1$b;->h:LmU1;

    iput-object p3, p0, LmU1$b;->i:Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    iput-object p4, p0, LmU1$b;->j:Lco/bird/android/model/identification/IdentificationManualEntryFormData;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LG6;
    .locals 15

    new-instance v6, LG6;

    new-instance v1, LlT1;

    iget-object v8, p0, LmU1$b;->g:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    iget-object v0, p0, LmU1$b;->h:LmU1;

    invoke-static {v0}, LmU1;->access$getContext$p(LmU1;)Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, LmU1$b;->g:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    invoke-virtual {v2}, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->toStringResId()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    const-string v0, "context.getString(formField.toStringResId())"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LmU1$b;->h:LmU1;

    iget-object v2, p0, LmU1$b;->i:Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    iget-object v3, p0, LmU1$b;->j:Lco/bird/android/model/identification/IdentificationManualEntryFormData;

    iget-object v4, p0, LmU1$b;->g:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    invoke-static {v0, v2, v3, v4}, LmU1;->access$generateErrorForField(LmU1;Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Lco/bird/android/model/identification/IdentificationManualEntryFormData;Lco/bird/android/model/identification/IdentificationManualEntryFormField;)Ljava/lang/String;

    move-result-object v10

    iget-object v0, p0, LmU1$b;->j:Lco/bird/android/model/identification/IdentificationManualEntryFormData;

    iget-object v2, p0, LmU1$b;->g:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    invoke-virtual {v0, v2}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->getValueForField(Lco/bird/android/model/identification/IdentificationManualEntryFormField;)Ljava/lang/Object;

    move-result-object v11

    const/4 v12, 0x0

    const/16 v13, 0x10

    const/4 v14, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v14}, LlT1;-><init>(Lco/bird/android/model/identification/IdentificationManualEntryFormField;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, Lhj4;->item_form_edit_text:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LmU1$b;->b()LG6;

    move-result-object v0

    return-object v0
.end method
