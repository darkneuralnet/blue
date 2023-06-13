.class public final LmY8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LvY8;

.field public b:Ljava/lang/Float;

.field public c:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic d(LmY8;)LvY8;
    .locals 0

    iget-object p0, p0, LmY8;->a:LvY8;

    return-object p0
.end method

.method public static bridge synthetic f(LmY8;)Ljava/lang/Float;
    .locals 0

    iget-object p0, p0, LmY8;->b:Ljava/lang/Float;

    return-object p0
.end method

.method public static bridge synthetic g(LmY8;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LmY8;->c:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public final a(LvY8;)LmY8;
    .locals 0

    iput-object p1, p0, LmY8;->a:LvY8;

    return-object p0
.end method

.method public final b(Ljava/lang/Float;)LmY8;
    .locals 0

    iput-object p1, p0, LmY8;->b:Ljava/lang/Float;

    return-object p0
.end method

.method public final c(Ljava/lang/Integer;)LmY8;
    .locals 0

    iput-object p1, p0, LmY8;->c:Ljava/lang/Integer;

    return-object p0
.end method

.method public final e()LOY8;
    .locals 2

    new-instance v0, LOY8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LOY8;-><init>(LmY8;LEY8;)V

    return-object v0
.end method
