.class public final LTd9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LV39;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(LTd9;)LV39;
    .locals 0

    iget-object p0, p0, LTd9;->a:LV39;

    return-object p0
.end method


# virtual methods
.method public final b(LV39;)LTd9;
    .locals 0

    iput-object p1, p0, LTd9;->a:LV39;

    return-object p0
.end method

.method public final c()Lje9;
    .locals 2

    new-instance v0, Lje9;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lje9;-><init>(LTd9;Lbe9;)V

    return-object v0
.end method
