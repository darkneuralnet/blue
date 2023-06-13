.class public final LV69;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Long;

.field public b:Lbw7;

.field public c:Lbw7;

.field public d:Lbw7;

.field public e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(LV69;)Lbw7;
    .locals 0

    iget-object p0, p0, LV69;->b:Lbw7;

    return-object p0
.end method

.method public static bridge synthetic b(LV69;)Lbw7;
    .locals 0

    iget-object p0, p0, LV69;->c:Lbw7;

    return-object p0
.end method

.method public static bridge synthetic c(LV69;)Lbw7;
    .locals 0

    iget-object p0, p0, LV69;->d:Lbw7;

    return-object p0
.end method

.method public static bridge synthetic j(LV69;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LV69;->e:Ljava/lang/Integer;

    return-object p0
.end method

.method public static bridge synthetic k(LV69;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, LV69;->a:Ljava/lang/Long;

    return-object p0
.end method


# virtual methods
.method public final d(Ljava/lang/Long;)LV69;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LV69;->a:Ljava/lang/Long;

    return-object p0
.end method

.method public final e(Lbw7;)LV69;
    .locals 0

    iput-object p1, p0, LV69;->b:Lbw7;

    return-object p0
.end method

.method public final f(Ljava/lang/Integer;)LV69;
    .locals 0

    iput-object p1, p0, LV69;->e:Ljava/lang/Integer;

    return-object p0
.end method

.method public final g(Lbw7;)LV69;
    .locals 0

    iput-object p1, p0, LV69;->c:Lbw7;

    return-object p0
.end method

.method public final h(Lbw7;)LV69;
    .locals 0

    iput-object p1, p0, LV69;->d:Lbw7;

    return-object p0
.end method

.method public final i()Lr79;
    .locals 2

    new-instance v0, Lr79;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lr79;-><init>(LV69;Lj79;)V

    return-object v0
.end method
