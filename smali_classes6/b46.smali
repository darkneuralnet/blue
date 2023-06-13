.class public abstract Lb46;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb46;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb46$a;

    invoke-direct {v0}, Lb46$a;-><init>()V

    sput-object v0, Lb46;->a:Lb46;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lb46;
    .locals 1

    sget-object v0, Lb46;->a:Lb46;

    return-object v0
.end method


# virtual methods
.method public abstract a()J
.end method
