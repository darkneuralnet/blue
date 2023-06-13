.class public final LiD8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LSD8;

.field public b:LuD8;

.field public c:LdE8;

.field public d:LGD8;

.field public e:Ljava/lang/Boolean;

.field public f:Ljava/lang/Float;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic g(LiD8;)LuD8;
    .locals 0

    iget-object p0, p0, LiD8;->b:LuD8;

    return-object p0
.end method

.method public static bridge synthetic h(LiD8;)LGD8;
    .locals 0

    iget-object p0, p0, LiD8;->d:LGD8;

    return-object p0
.end method

.method public static bridge synthetic i(LiD8;)LSD8;
    .locals 0

    iget-object p0, p0, LiD8;->a:LSD8;

    return-object p0
.end method

.method public static bridge synthetic j(LiD8;)LdE8;
    .locals 0

    iget-object p0, p0, LiD8;->c:LdE8;

    return-object p0
.end method

.method public static bridge synthetic l(LiD8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LiD8;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic m(LiD8;)Ljava/lang/Float;
    .locals 0

    iget-object p0, p0, LiD8;->f:Ljava/lang/Float;

    return-object p0
.end method


# virtual methods
.method public final a(LuD8;)LiD8;
    .locals 0

    iput-object p1, p0, LiD8;->b:LuD8;

    return-object p0
.end method

.method public final b(LGD8;)LiD8;
    .locals 0

    iput-object p1, p0, LiD8;->d:LGD8;

    return-object p0
.end method

.method public final c(Ljava/lang/Boolean;)LiD8;
    .locals 0

    iput-object p1, p0, LiD8;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final d(LSD8;)LiD8;
    .locals 0

    iput-object p1, p0, LiD8;->a:LSD8;

    return-object p0
.end method

.method public final e(Ljava/lang/Float;)LiD8;
    .locals 0

    iput-object p1, p0, LiD8;->f:Ljava/lang/Float;

    return-object p0
.end method

.method public final f(LdE8;)LiD8;
    .locals 0

    iput-object p1, p0, LiD8;->c:LdE8;

    return-object p0
.end method

.method public final k()LBE8;
    .locals 2

    new-instance v0, LBE8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LBE8;-><init>(LiD8;LoE8;)V

    return-object v0
.end method
