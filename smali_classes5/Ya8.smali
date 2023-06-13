.class public final LYa8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LV39;

.field public b:Ljava/lang/Boolean;

.field public c:Ljf9;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic e(LYa8;)LV39;
    .locals 0

    iget-object p0, p0, LYa8;->a:LV39;

    return-object p0
.end method

.method public static bridge synthetic f(LYa8;)Ljf9;
    .locals 0

    iget-object p0, p0, LYa8;->c:Ljf9;

    return-object p0
.end method

.method public static bridge synthetic g(LYa8;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, LYa8;->b:Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public final a(LV39;)LYa8;
    .locals 0

    iput-object p1, p0, LYa8;->a:LV39;

    return-object p0
.end method

.method public final b(Ljava/lang/Boolean;)LYa8;
    .locals 0

    iput-object p1, p0, LYa8;->b:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final c(Ljf9;)LYa8;
    .locals 0

    iput-object p1, p0, LYa8;->c:Ljf9;

    return-object p0
.end method

.method public final d()Lob8;
    .locals 2

    new-instance v0, Lob8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lob8;-><init>(LYa8;Lmb8;)V

    return-object v0
.end method
