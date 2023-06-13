.class public final Lu29;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LE29;

.field public b:Ljava/lang/Boolean;

.field public c:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic d(Lu29;)LE29;
    .locals 0

    iget-object p0, p0, Lu29;->a:LE29;

    return-object p0
.end method

.method public static bridge synthetic f(Lu29;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lu29;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic g(Lu29;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lu29;->b:Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lu29;
    .locals 0

    iput-object p1, p0, Lu29;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final b(LE29;)Lu29;
    .locals 0

    iput-object p1, p0, Lu29;->a:LE29;

    return-object p0
.end method

.method public final c(Ljava/lang/Boolean;)Lu29;
    .locals 0

    iput-object p1, p0, Lu29;->b:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final e()LX29;
    .locals 2

    new-instance v0, LX29;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LX29;-><init>(Lu29;LN29;)V

    return-object v0
.end method
