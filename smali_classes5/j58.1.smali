.class public final Lj58;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LG59;

.field public b:Ljava/lang/Boolean;

.field public c:LLk9;

.field public d:LDR7;

.field public e:LDR7;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lj58;)LDR7;
    .locals 0

    iget-object p0, p0, Lj58;->d:LDR7;

    return-object p0
.end method

.method public static bridge synthetic b(Lj58;)LDR7;
    .locals 0

    iget-object p0, p0, Lj58;->e:LDR7;

    return-object p0
.end method

.method public static bridge synthetic i(Lj58;)LG59;
    .locals 0

    iget-object p0, p0, Lj58;->a:LG59;

    return-object p0
.end method

.method public static bridge synthetic j(Lj58;)LLk9;
    .locals 0

    iget-object p0, p0, Lj58;->c:LLk9;

    return-object p0
.end method

.method public static bridge synthetic k(Lj58;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lj58;->b:Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public final c(LDR7;)Lj58;
    .locals 0

    iput-object p1, p0, Lj58;->d:LDR7;

    return-object p0
.end method

.method public final d(LDR7;)Lj58;
    .locals 0

    iput-object p1, p0, Lj58;->e:LDR7;

    return-object p0
.end method

.method public final e(LG59;)Lj58;
    .locals 0

    iput-object p1, p0, Lj58;->a:LG59;

    return-object p0
.end method

.method public final f(Ljava/lang/Boolean;)Lj58;
    .locals 0

    iput-object p1, p0, Lj58;->b:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final g(LLk9;)Lj58;
    .locals 0

    iput-object p1, p0, Lj58;->c:LLk9;

    return-object p0
.end method

.method public final h()LP58;
    .locals 2

    new-instance v0, LP58;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LP58;-><init>(Lj58;Lz58;)V

    return-object v0
.end method
