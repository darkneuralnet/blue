.class public final LSF8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LVT8;

.field public b:LGF8;

.field public c:LzE8;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(LSF8;)LzE8;
    .locals 0

    iget-object p0, p0, LSF8;->c:LzE8;

    return-object p0
.end method

.method public static bridge synthetic b(LSF8;)LGF8;
    .locals 0

    iget-object p0, p0, LSF8;->b:LGF8;

    return-object p0
.end method

.method public static bridge synthetic g(LSF8;)LVT8;
    .locals 0

    iget-object p0, p0, LSF8;->a:LVT8;

    return-object p0
.end method


# virtual methods
.method public final c(LGF8;)LSF8;
    .locals 0

    iput-object p1, p0, LSF8;->b:LGF8;

    return-object p0
.end method

.method public final d(LzE8;)LSF8;
    .locals 0

    iput-object p1, p0, LSF8;->c:LzE8;

    return-object p0
.end method

.method public final e(LVT8;)LSF8;
    .locals 0

    iput-object p1, p0, LSF8;->a:LVT8;

    return-object p0
.end method

.method public final f()LqG8;
    .locals 2

    new-instance v0, LqG8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LqG8;-><init>(LSF8;LeG8;)V

    return-object v0
.end method
