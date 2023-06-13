.class public final Lf89;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LG59;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lf89;)LG59;
    .locals 0

    iget-object p0, p0, Lf89;->a:LG59;

    return-object p0
.end method


# virtual methods
.method public final b(LG59;)Lf89;
    .locals 0

    iput-object p1, p0, Lf89;->a:LG59;

    return-object p0
.end method

.method public final c()Lv89;
    .locals 2

    new-instance v0, Lv89;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lv89;-><init>(Lf89;Ln89;)V

    return-object v0
.end method
