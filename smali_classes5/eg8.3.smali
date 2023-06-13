.class public final Leg8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LcW8;

.field public b:Ljava/lang/Boolean;

.field public c:Ljava/lang/Boolean;

.field public d:LX29;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic f(Leg8;)LcW8;
    .locals 0

    iget-object p0, p0, Leg8;->a:LcW8;

    return-object p0
.end method

.method public static bridge synthetic g(Leg8;)LX29;
    .locals 0

    iget-object p0, p0, Leg8;->d:LX29;

    return-object p0
.end method

.method public static bridge synthetic h(Leg8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Leg8;->b:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic i(Leg8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Leg8;->c:Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public final a(LX29;)Leg8;
    .locals 0

    iput-object p1, p0, Leg8;->d:LX29;

    return-object p0
.end method

.method public final b(LcW8;)Leg8;
    .locals 0

    iput-object p1, p0, Leg8;->a:LcW8;

    return-object p0
.end method

.method public final c(Ljava/lang/Boolean;)Leg8;
    .locals 0

    iput-object p1, p0, Leg8;->b:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final d(Ljava/lang/Boolean;)Leg8;
    .locals 0

    iput-object p1, p0, Leg8;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final e()LJg8;
    .locals 2

    new-instance v0, LJg8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LJg8;-><init>(Leg8;Ltg8;)V

    return-object v0
.end method
