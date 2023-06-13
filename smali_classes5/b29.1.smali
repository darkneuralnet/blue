.class public final Lb29;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Long;

.field public b:LV39;

.field public c:Ljava/lang/Boolean;

.field public d:Ljava/lang/Boolean;

.field public e:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic g(Lb29;)LV39;
    .locals 0

    iget-object p0, p0, Lb29;->b:LV39;

    return-object p0
.end method

.method public static bridge synthetic h(Lb29;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lb29;->d:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic i(Lb29;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lb29;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic j(Lb29;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lb29;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static bridge synthetic k(Lb29;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lb29;->a:Ljava/lang/Long;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lb29;
    .locals 0

    iput-object p1, p0, Lb29;->d:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final b(Ljava/lang/Boolean;)Lb29;
    .locals 0

    iput-object p1, p0, Lb29;->e:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final c(Ljava/lang/Long;)Lb29;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lb29;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public final d(LV39;)Lb29;
    .locals 0

    iput-object p1, p0, Lb29;->b:LV39;

    return-object p0
.end method

.method public final e(Ljava/lang/Boolean;)Lb29;
    .locals 0

    iput-object p1, p0, Lb29;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final f()Lv29;
    .locals 2

    new-instance v0, Lv29;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lv29;-><init>(Lb29;Ll29;)V

    return-object v0
.end method
