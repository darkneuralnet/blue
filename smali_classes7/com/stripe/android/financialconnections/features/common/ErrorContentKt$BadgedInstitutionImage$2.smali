.class final Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$BadgedInstitutionImage$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->BadgedInstitutionImage(Ljava/lang/String;Lkotlin/Pair;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $badge:Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Pair<",
            "LnE3;",
            "Lhy5;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $institutionIconUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkotlin/Pair;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/Pair<",
            "+",
            "LnE3;",
            "+",
            "Lhy5;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$BadgedInstitutionImage$2;->$institutionIconUrl:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$BadgedInstitutionImage$2;->$badge:Lkotlin/Pair;

    iput p3, p0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$BadgedInstitutionImage$2;->$$changed:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$BadgedInstitutionImage$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 2

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$BadgedInstitutionImage$2;->$institutionIconUrl:Ljava/lang/String;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$BadgedInstitutionImage$2;->$badge:Lkotlin/Pair;

    iget v1, p0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$BadgedInstitutionImage$2;->$$changed:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {p2, v0, p1, v1}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->access$BadgedInstitutionImage(Ljava/lang/String;Lkotlin/Pair;LEt0;I)V

    return-void
.end method
