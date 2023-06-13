.class public final Lbo/app/n4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbo/app/m2;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lbo/app/n4;",
        "Lbo/app/m2;",
        "Lbo/app/z1;",
        "brazeRequest",
        "",
        "a",
        "Lbo/app/l2;",
        "request",
        "b",
        "Lbo/app/h2;",
        "httpConnector",
        "Lbo/app/g2;",
        "internalEventPublisher",
        "externalEventPublisher",
        "Lbo/app/g1;",
        "feedStorageProvider",
        "Lbo/app/a5;",
        "serverConfigStorageProvider",
        "Lbo/app/y;",
        "contentCardsStorageProvider",
        "Lbo/app/y1;",
        "brazeManager",
        "<init>",
        "(Lbo/app/h2;Lbo/app/g2;Lbo/app/g2;Lbo/app/g1;Lbo/app/a5;Lbo/app/y;Lbo/app/y1;)V",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field private final a:Lbo/app/h2;

.field private final b:Lbo/app/g2;

.field private final c:Lbo/app/g2;

.field private final d:Lbo/app/g1;

.field private final e:Lbo/app/a5;

.field private final f:Lbo/app/y;

.field private final g:Lbo/app/y1;


# direct methods
.method public constructor <init>(Lbo/app/h2;Lbo/app/g2;Lbo/app/g2;Lbo/app/g1;Lbo/app/a5;Lbo/app/y;Lbo/app/y1;)V
    .locals 1

    const-string v0, "httpConnector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalEventPublisher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalEventPublisher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feedStorageProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serverConfigStorageProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentCardsStorageProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brazeManager"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbo/app/n4;->a:Lbo/app/h2;

    iput-object p2, p0, Lbo/app/n4;->b:Lbo/app/g2;

    iput-object p3, p0, Lbo/app/n4;->c:Lbo/app/g2;

    iput-object p4, p0, Lbo/app/n4;->d:Lbo/app/g1;

    iput-object p5, p0, Lbo/app/n4;->e:Lbo/app/a5;

    iput-object p6, p0, Lbo/app/n4;->f:Lbo/app/y;

    iput-object p7, p0, Lbo/app/n4;->g:Lbo/app/y1;

    return-void
.end method

.method public static final synthetic a(Lbo/app/n4;Lbo/app/z1;)V
    .locals 0

    invoke-direct {p0, p1}, Lbo/app/n4;->a(Lbo/app/z1;)V

    return-void
.end method

.method private final a(Lbo/app/z1;)V
    .locals 10

    new-instance v9, Lbo/app/s;

    iget-object v2, p0, Lbo/app/n4;->a:Lbo/app/h2;

    iget-object v3, p0, Lbo/app/n4;->b:Lbo/app/g2;

    iget-object v4, p0, Lbo/app/n4;->c:Lbo/app/g2;

    iget-object v5, p0, Lbo/app/n4;->d:Lbo/app/g1;

    iget-object v6, p0, Lbo/app/n4;->g:Lbo/app/y1;

    iget-object v7, p0, Lbo/app/n4;->e:Lbo/app/a5;

    iget-object v8, p0, Lbo/app/n4;->f:Lbo/app/y;

    move-object v0, v9

    move-object v1, p1

    invoke-direct/range {v0 .. v8}, Lbo/app/s;-><init>(Lbo/app/z1;Lbo/app/h2;Lbo/app/g2;Lbo/app/g2;Lbo/app/g1;Lbo/app/y1;Lbo/app/a5;Lbo/app/y;)V

    invoke-virtual {v9}, Lbo/app/s;->c()V

    return-void
.end method


# virtual methods
.method public a(Lbo/app/l2;)V
    .locals 8

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lbo/app/z1;

    if-eqz v0, :cond_0

    check-cast p1, Lbo/app/z1;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->g:Lk20$a;

    sget-object v5, Lbo/app/n4$c;->b:Lbo/app/n4$c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_1
    invoke-direct {p0, p1}, Lbo/app/n4;->a(Lbo/app/z1;)V

    return-void
.end method

.method public b(Lbo/app/l2;)V
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "request"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lbo/app/z1;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lbo/app/z1;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    sget-object v3, Lk20;->a:Lk20;

    sget-object v5, Lk20$a;->g:Lk20$a;

    sget-object v8, Lbo/app/n4$a;->b:Lbo/app/n4$a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x6

    const/4 v10, 0x0

    move-object/from16 v4, p0

    invoke-static/range {v3 .. v10}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_1
    sget-object v11, LZ10;->b:LZ10;

    new-instance v14, Lbo/app/n4$b;

    move-object/from16 v1, p0

    invoke-direct {v14, v1, v0, v2}, Lbo/app/n4$b;-><init>(Lbo/app/n4;Lbo/app/z1;Lkotlin/coroutines/Continuation;)V

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x3

    const/16 v16, 0x0

    invoke-static/range {v11 .. v16}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
