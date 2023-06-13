.class public final LV48;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LP58;

.field public b:Ljava/lang/Integer;

.field public c:Ls19;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic d(LV48;)LP58;
    .locals 0

    iget-object p0, p0, LV48;->a:LP58;

    return-object p0
.end method

.method public static bridge synthetic f(LV48;)Ls19;
    .locals 0

    iget-object p0, p0, LV48;->c:Ls19;

    return-object p0
.end method

.method public static bridge synthetic g(LV48;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LV48;->b:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)LV48;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LV48;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public final b(Ls19;)LV48;
    .locals 0

    iput-object p1, p0, LV48;->c:Ls19;

    return-object p0
.end method

.method public final c(LP58;)LV48;
    .locals 0

    iput-object p1, p0, LV48;->a:LP58;

    return-object p0
.end method

.method public final e()Lp78;
    .locals 2

    new-instance v0, Lp78;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lp78;-><init>(LV48;La78;)V

    return-object v0
.end method
