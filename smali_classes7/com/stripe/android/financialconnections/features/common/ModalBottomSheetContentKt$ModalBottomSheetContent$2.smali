.class final Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt;->ModalBottomSheetContent(Lcom/stripe/android/financialconnections/ui/TextResource$Text;Lcom/stripe/android/financialconnections/ui/TextResource$Text;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/stripe/android/financialconnections/ui/TextResource;Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function0;LEt0;I)V
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

.field final synthetic $bullets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $connectedAccountNotice:Lcom/stripe/android/financialconnections/ui/TextResource;

.field final synthetic $cta:Ljava/lang/String;

.field final synthetic $learnMore:Lcom/stripe/android/financialconnections/ui/TextResource;

.field final synthetic $onClickableTextClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onConfirmModalClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $subtitle:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

.field final synthetic $title:Lcom/stripe/android/financialconnections/ui/TextResource$Text;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/ui/TextResource$Text;Lcom/stripe/android/financialconnections/ui/TextResource$Text;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/stripe/android/financialconnections/ui/TextResource;Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/ui/TextResource$Text;",
            "Lcom/stripe/android/financialconnections/ui/TextResource$Text;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;",
            ">;",
            "Lcom/stripe/android/financialconnections/ui/TextResource;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/ui/TextResource;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$title:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$subtitle:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$bullets:Ljava/util/List;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$connectedAccountNotice:Lcom/stripe/android/financialconnections/ui/TextResource;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$cta:Ljava/lang/String;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$learnMore:Lcom/stripe/android/financialconnections/ui/TextResource;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$onConfirmModalClick:Lkotlin/jvm/functions/Function0;

    iput p9, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$$changed:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 10

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$title:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$subtitle:Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$onClickableTextClick:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$bullets:Ljava/util/List;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$connectedAccountNotice:Lcom/stripe/android/financialconnections/ui/TextResource;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$cta:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$learnMore:Lcom/stripe/android/financialconnections/ui/TextResource;

    iget-object v7, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$onConfirmModalClick:Lkotlin/jvm/functions/Function0;

    iget p2, p0, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt$ModalBottomSheetContent$2;->$$changed:I

    or-int/lit8 v9, p2, 0x1

    move-object v8, p1

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/financialconnections/features/common/ModalBottomSheetContentKt;->access$ModalBottomSheetContent(Lcom/stripe/android/financialconnections/ui/TextResource$Text;Lcom/stripe/android/financialconnections/ui/TextResource$Text;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/stripe/android/financialconnections/ui/TextResource;Ljava/lang/String;Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function0;LEt0;I)V

    return-void
.end method
