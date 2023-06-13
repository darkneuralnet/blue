.class public final Lre9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lv29;

.field public b:Lo19;

.field public c:Ljf9;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lre9;)Lo19;
    .locals 0

    iget-object p0, p0, Lre9;->b:Lo19;

    return-object p0
.end method

.method public static bridge synthetic b(Lre9;)Lv29;
    .locals 0

    iget-object p0, p0, Lre9;->a:Lv29;

    return-object p0
.end method

.method public static bridge synthetic g(Lre9;)Ljf9;
    .locals 0

    iget-object p0, p0, Lre9;->c:Ljf9;

    return-object p0
.end method


# virtual methods
.method public final c(Lo19;)Lre9;
    .locals 0

    iput-object p1, p0, Lre9;->b:Lo19;

    return-object p0
.end method

.method public final d(Lv29;)Lre9;
    .locals 0

    iput-object p1, p0, Lre9;->a:Lv29;

    return-object p0
.end method

.method public final e(Ljf9;)Lre9;
    .locals 0

    iput-object p1, p0, Lre9;->c:Ljf9;

    return-object p0
.end method

.method public final f()LFe9;
    .locals 2

    new-instance v0, LFe9;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LFe9;-><init>(Lre9;Lye9;)V

    return-object v0
.end method
