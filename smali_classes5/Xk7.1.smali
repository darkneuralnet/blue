.class public final LXk7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LEm7;

.field public b:LWk7;

.field public c:LBm7;

.field public d:Ldz9;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(LXk7;)Ldz9;
    .locals 0

    iget-object p0, p0, LXk7;->d:Ldz9;

    return-object p0
.end method

.method public static bridge synthetic b(LXk7;)LWk7;
    .locals 0

    iget-object p0, p0, LXk7;->b:LWk7;

    return-object p0
.end method

.method public static bridge synthetic h(LXk7;)LBm7;
    .locals 0

    iget-object p0, p0, LXk7;->c:LBm7;

    return-object p0
.end method

.method public static bridge synthetic i(LXk7;)LEm7;
    .locals 0

    iget-object p0, p0, LXk7;->a:LEm7;

    return-object p0
.end method


# virtual methods
.method public final c(Ldz9;)LXk7;
    .locals 0

    iput-object p1, p0, LXk7;->d:Ldz9;

    return-object p0
.end method

.method public final d(LWk7;)LXk7;
    .locals 0

    iput-object p1, p0, LXk7;->b:LWk7;

    return-object p0
.end method

.method public final e(LBm7;)LXk7;
    .locals 0

    iput-object p1, p0, LXk7;->c:LBm7;

    return-object p0
.end method

.method public final f(LEm7;)LXk7;
    .locals 0

    iput-object p1, p0, LXk7;->a:LEm7;

    return-object p0
.end method

.method public final g()Lul7;
    .locals 2

    new-instance v0, Lul7;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lul7;-><init>(LXk7;LYk7;)V

    return-object v0
.end method
