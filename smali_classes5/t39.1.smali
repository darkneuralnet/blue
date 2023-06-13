.class public final Lt39;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LFU8;

.field public b:LmT8;

.field public c:LX29;

.field public d:Lbw7;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lt39;)Lbw7;
    .locals 0

    iget-object p0, p0, Lt39;->d:Lbw7;

    return-object p0
.end method

.method public static bridge synthetic b(Lt39;)LmT8;
    .locals 0

    iget-object p0, p0, Lt39;->b:LmT8;

    return-object p0
.end method

.method public static bridge synthetic c(Lt39;)LFU8;
    .locals 0

    iget-object p0, p0, Lt39;->a:LFU8;

    return-object p0
.end method

.method public static bridge synthetic d(Lt39;)LX29;
    .locals 0

    iget-object p0, p0, Lt39;->c:LX29;

    return-object p0
.end method


# virtual methods
.method public final e(LX29;)Lt39;
    .locals 0

    iput-object p1, p0, Lt39;->c:LX29;

    return-object p0
.end method

.method public final f(LmT8;)Lt39;
    .locals 0

    iput-object p1, p0, Lt39;->b:LmT8;

    return-object p0
.end method

.method public final g(LFU8;)Lt39;
    .locals 0

    iput-object p1, p0, Lt39;->a:LFU8;

    return-object p0
.end method

.method public final h(Lbw7;)Lt39;
    .locals 0

    iput-object p1, p0, Lt39;->d:Lbw7;

    return-object p0
.end method

.method public final i()LL39;
    .locals 2

    new-instance v0, LL39;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LL39;-><init>(Lt39;LC39;)V

    return-object v0
.end method
