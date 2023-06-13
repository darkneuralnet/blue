.class final Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1;->invoke(LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LKY2;",
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
.field final synthetic $bottomSheetContent$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $coroutineScope:LZC0;

.field final synthetic $linkAccount$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $sheetState:LGU2;

.field final synthetic this$0:Lcom/stripe/android/link/LinkActivity;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/LinkActivity;LsP5;LZC0;LGU2;LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkActivity;",
            "LsP5<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;",
            "LZC0;",
            "LGU2;",
            "LEX2<",
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->this$0:Lcom/stripe/android/link/LinkActivity;

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->$linkAccount$delegate:LsP5;

    iput-object p3, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->$coroutineScope:LZC0;

    iput-object p4, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->$sheetState:LGU2;

    iput-object p5, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->$bottomSheetContent$delegate:LEX2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKY2;

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->invoke(LKY2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LKY2;)V
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "$this$NavHost"

    move-object/from16 v9, p1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/stripe/android/link/LinkScreen$Loading;->INSTANCE:Lcom/stripe/android/link/LinkScreen$Loading;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkScreen;->getRoute()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v1, Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt;->INSTANCE:Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt;

    invoke-virtual {v1}, Lcom/stripe/android/link/ComposableSingletons$LinkActivityKt;->getLambda-2$link_release()Lkotlin/jvm/functions/Function3;

    move-result-object v6

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, LMY2;->b(LKY2;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    sget-object v1, Lcom/stripe/android/link/LinkScreen$SignUp;->INSTANCE:Lcom/stripe/android/link/LinkScreen$SignUp;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkScreen;->getRoute()Ljava/lang/String;

    move-result-object v3

    new-instance v1, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$1;

    iget-object v2, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->this$0:Lcom/stripe/android/link/LinkActivity;

    invoke-direct {v1, v2}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$1;-><init>(Lcom/stripe/android/link/LinkActivity;)V

    const v2, 0x27bf6b6d

    const/4 v10, 0x1

    invoke-static {v2, v10, v1}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v6

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, LMY2;->b(LKY2;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    sget-object v1, Lcom/stripe/android/link/LinkScreen$Verification;->INSTANCE:Lcom/stripe/android/link/LinkScreen$Verification;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkScreen;->getRoute()Ljava/lang/String;

    move-result-object v3

    new-instance v1, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$2;

    iget-object v2, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->$linkAccount$delegate:LsP5;

    iget-object v6, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->this$0:Lcom/stripe/android/link/LinkActivity;

    invoke-direct {v1, v2, v6}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$2;-><init>(LsP5;Lcom/stripe/android/link/LinkActivity;)V

    const v2, -0xe8b8092

    invoke-static {v2, v10, v1}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v6

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, LMY2;->b(LKY2;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    sget-object v1, Lcom/stripe/android/link/LinkScreen$Wallet;->INSTANCE:Lcom/stripe/android/link/LinkScreen$Wallet;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkScreen;->getRoute()Ljava/lang/String;

    move-result-object v3

    new-instance v1, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$3;

    iget-object v12, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->$linkAccount$delegate:LsP5;

    iget-object v13, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->this$0:Lcom/stripe/android/link/LinkActivity;

    iget-object v14, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->$coroutineScope:LZC0;

    iget-object v15, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->$sheetState:LGU2;

    iget-object v2, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->$bottomSheetContent$delegate:LEX2;

    move-object v11, v1

    move-object/from16 v16, v2

    invoke-direct/range {v11 .. v16}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$3;-><init>(LsP5;Lcom/stripe/android/link/LinkActivity;LZC0;LGU2;LEX2;)V

    const v2, -0x44d66c91

    invoke-static {v2, v10, v1}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v6

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, LMY2;->b(LKY2;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    const-string v3, "PaymentMethod?loadFromArgs={loadFromArgs}"

    const-string v1, "loadFromArgs"

    sget-object v2, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$4;->INSTANCE:Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$4;

    invoke-static {v1, v2}, LnY2;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)LmY2;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v1, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$5;

    iget-object v2, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->$linkAccount$delegate:LsP5;

    iget-object v6, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->this$0:Lcom/stripe/android/link/LinkActivity;

    invoke-direct {v1, v2, v6}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$5;-><init>(LsP5;Lcom/stripe/android/link/LinkActivity;)V

    const v2, -0x7b215890

    invoke-static {v2, v10, v1}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v6

    const/4 v7, 0x4

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, LMY2;->b(LKY2;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    const-string v3, "CardEdit?id={id}"

    const-string v1, "id"

    sget-object v2, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$6;->INSTANCE:Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$6;

    invoke-static {v1, v2}, LnY2;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)LmY2;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v1, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$7;

    iget-object v2, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->$linkAccount$delegate:LsP5;

    iget-object v6, v0, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5;->this$0:Lcom/stripe/android/link/LinkActivity;

    invoke-direct {v1, v2, v6}, Lcom/stripe/android/link/LinkActivity$onCreate$1$2$1$1$5$7;-><init>(LsP5;Lcom/stripe/android/link/LinkActivity;)V

    const v2, 0x4e93bb71

    invoke-static {v2, v10, v1}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v6

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, LMY2;->b(LKY2;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    return-void
.end method
