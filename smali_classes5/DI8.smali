.class public final LDI8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LnJ8;

.field public b:LPI8;

.field public c:LzJ8;

.field public d:LbJ8;

.field public e:Ljava/lang/Boolean;

.field public f:Ljava/lang/Float;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic g(LDI8;)LPI8;
    .locals 0

    iget-object p0, p0, LDI8;->b:LPI8;

    return-object p0
.end method

.method public static bridge synthetic h(LDI8;)LbJ8;
    .locals 0

    iget-object p0, p0, LDI8;->d:LbJ8;

    return-object p0
.end method

.method public static bridge synthetic i(LDI8;)LnJ8;
    .locals 0

    iget-object p0, p0, LDI8;->a:LnJ8;

    return-object p0
.end method

.method public static bridge synthetic j(LDI8;)LzJ8;
    .locals 0

    iget-object p0, p0, LDI8;->c:LzJ8;

    return-object p0
.end method

.method public static bridge synthetic l(LDI8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LDI8;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic m(LDI8;)Ljava/lang/Float;
    .locals 0

    iget-object p0, p0, LDI8;->f:Ljava/lang/Float;

    return-object p0
.end method


# virtual methods
.method public final a(LPI8;)LDI8;
    .locals 0

    iput-object p1, p0, LDI8;->b:LPI8;

    return-object p0
.end method

.method public final b(LbJ8;)LDI8;
    .locals 0

    iput-object p1, p0, LDI8;->d:LbJ8;

    return-object p0
.end method

.method public final c(Ljava/lang/Boolean;)LDI8;
    .locals 0

    iput-object p1, p0, LDI8;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final d(LnJ8;)LDI8;
    .locals 0

    iput-object p1, p0, LDI8;->a:LnJ8;

    return-object p0
.end method

.method public final e(Ljava/lang/Float;)LDI8;
    .locals 0

    iput-object p1, p0, LDI8;->f:Ljava/lang/Float;

    return-object p0
.end method

.method public final f(LzJ8;)LDI8;
    .locals 0

    iput-object p1, p0, LDI8;->c:LzJ8;

    return-object p0
.end method

.method public final k()LWJ8;
    .locals 2

    new-instance v0, LWJ8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LWJ8;-><init>(LDI8;LKJ8;)V

    return-object v0
.end method
