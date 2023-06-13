.class public final LUH8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LhR8;

.field public b:LIH8;

.field public c:LEG8;

.field public d:LWC8;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(LUH8;)LWC8;
    .locals 0

    iget-object p0, p0, LUH8;->d:LWC8;

    return-object p0
.end method

.method public static bridge synthetic b(LUH8;)LEG8;
    .locals 0

    iget-object p0, p0, LUH8;->c:LEG8;

    return-object p0
.end method

.method public static bridge synthetic c(LUH8;)LIH8;
    .locals 0

    iget-object p0, p0, LUH8;->b:LIH8;

    return-object p0
.end method

.method public static bridge synthetic i(LUH8;)LhR8;
    .locals 0

    iget-object p0, p0, LUH8;->a:LhR8;

    return-object p0
.end method


# virtual methods
.method public final d(LEG8;)LUH8;
    .locals 0

    iput-object p1, p0, LUH8;->c:LEG8;

    return-object p0
.end method

.method public final e(LIH8;)LUH8;
    .locals 0

    iput-object p1, p0, LUH8;->b:LIH8;

    return-object p0
.end method

.method public final f(LWC8;)LUH8;
    .locals 0

    iput-object p1, p0, LUH8;->d:LWC8;

    return-object p0
.end method

.method public final g(LhR8;)LUH8;
    .locals 0

    iput-object p1, p0, LUH8;->a:LhR8;

    return-object p0
.end method

.method public final h()LsI8;
    .locals 2

    new-instance v0, LsI8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LsI8;-><init>(LUH8;LgI8;)V

    return-object v0
.end method
