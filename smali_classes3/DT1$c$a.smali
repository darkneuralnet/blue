.class public final LDT1$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDT1$c;-><init>(LDT1;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
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
        "SMAP\nIdentificationManualEntryFormAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$IdentificationSelectorViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,238:1\n18#2:239\n9#3,4:240\n*S KotlinDebug\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$IdentificationSelectorViewHolder$1\n*L\n104#1:239\n104#1:240,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LDT1;

.field public final synthetic h:LDT1$c;


# direct methods
.method public constructor <init>(LDT1;LDT1$c;)V
    .locals 0

    iput-object p1, p0, LDT1$c$a;->g:LDT1;

    iput-object p2, p0, LDT1$c$a;->h:LDT1$c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LDT1$c$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 4

    iget-object p1, p0, LDT1$c$a;->g:LDT1;

    invoke-static {p1}, LDT1;->access$getAdapterData(LDT1;)LE6;

    move-result-object p1

    iget-object v0, p0, LDT1$c$a;->h:LDT1$c;

    invoke-virtual {v0}, Lh0;->getSafePosition()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LnU1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LnU1;

    if-eqz p1, :cond_7

    iget-object v0, p0, LDT1$c$a;->g:LDT1;

    invoke-virtual {p1}, LnU1;->f()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, LnU1;->f()Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LnU1;->c()Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->NATIONALITY:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    if-ne v2, v3, :cond_2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, LnU1;->c()Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    move-result-object p1

    sget-object v2, Lco/bird/android/model/identification/IdentificationManualEntryFormField;->GENDER:Lco/bird/android/model/identification/IdentificationManualEntryFormField;

    if-ne p1, v2, :cond_3

    sget-object v1, Lco/bird/android/model/identification/IdentificationGender;->UNKNOWN:Lco/bird/android/model/identification/IdentificationGender;

    :cond_3
    :goto_1
    instance-of p1, v1, Ljava/util/Locale;

    if-eqz p1, :cond_4

    invoke-static {v0}, LDT1;->access$getCountryClicksSubject$p(LDT1;)Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-virtual {p1, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    instance-of p1, v1, Lco/bird/android/model/identification/IdentificationGender;

    if-eqz p1, :cond_5

    invoke-static {v0}, LDT1;->access$getGenderClicksSubject$p(LDT1;)Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-virtual {p1, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    instance-of p1, v1, Lco/bird/android/model/identification/IdentificationDocumentType;

    if-eqz p1, :cond_6

    invoke-static {v0}, LDT1;->access$getDocumentTypeClicksSubject$p(LDT1;)Lio/reactivex/subjects/d;

    move-result-object p1

    invoke-virtual {p1, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Unknown data type encountered when clicking on view in Manual Entry Form recycler view"

    invoke-static {v0, p1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    :goto_2
    return-void
.end method
