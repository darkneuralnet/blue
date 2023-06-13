.class public final LQ19;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LX29;

.field public b:LcW8;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(LQ19;)LcW8;
    .locals 0

    iget-object p0, p0, LQ19;->b:LcW8;

    return-object p0
.end method

.method public static bridge synthetic e(LQ19;)LX29;
    .locals 0

    iget-object p0, p0, LQ19;->a:LX29;

    return-object p0
.end method


# virtual methods
.method public final b(LX29;)LQ19;
    .locals 0

    iput-object p1, p0, LQ19;->a:LX29;

    return-object p0
.end method

.method public final c(LcW8;)LQ19;
    .locals 0

    iput-object p1, p0, LQ19;->b:LcW8;

    return-object p0
.end method

.method public final d()Lk29;
    .locals 2

    new-instance v0, Lk29;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lk29;-><init>(LQ19;La29;)V

    return-object v0
.end method
