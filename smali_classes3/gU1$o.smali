.class public final LgU1$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LgU1;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/identification/IdentificationGender;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationGender;",
        "kotlin.jvm.PlatformType",
        "gender",
        "",
        "a",
        "(Lco/bird/android/model/identification/IdentificationGender;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LgU1;


# direct methods
.method public constructor <init>(LgU1;)V
    .locals 0

    iput-object p1, p0, LgU1$o;->g:LgU1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/identification/IdentificationGender;)V
    .locals 3

    iget-object v0, p0, LgU1$o;->g:LgU1;

    invoke-static {v0}, LgU1;->access$getAdapter$p(LgU1;)LDT1;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "adapter"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v1}, LDT1;->A()Lco/bird/android/model/identification/IdentificationManualEntryFormData;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->GENDER:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    invoke-virtual {v1, v2, p1}, Lco/bird/android/model/identification/IdentificationManualEntryFormData;->updateForm(Lco/bird/android/model/identification/IdentificationManualEntryFormField;Ljava/lang/Object;)Lco/bird/android/model/identification/IdentificationManualEntryFormData;

    move-result-object p1

    invoke-static {v0, p1}, LgU1;->access$renderFormData(LgU1;Lco/bird/android/model/identification/IdentificationManualEntryFormData;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/identification/IdentificationGender;

    invoke-virtual {p0, p1}, LgU1$o;->a(Lco/bird/android/model/identification/IdentificationGender;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
